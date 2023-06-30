package com.lds.ecomerce.infrastructure.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Table(name = "evaluation_product")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class AvaliacaoProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProdutoEntity idProdutoEntity;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsuarioEntity idUsuarioEntity;

    @Column(name = "date_of_evaluation")
    private LocalDateTime dataAvaliacao;

    @Column(name = "stars",length = 5)
    private String estrelas;

    @Column(name = "user_comment",length = 255)
    private String comentario;

}
