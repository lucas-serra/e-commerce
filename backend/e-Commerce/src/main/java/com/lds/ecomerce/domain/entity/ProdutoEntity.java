package com.lds.ecomerce.domain.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Entity
@Table(name = "product")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name",length = 100)
    private String nomeProduto;

    @Column(name = "description",length = 200)
    private String descricao;

    @Column(name = "value")
    private Double valor;

    @Column(name = "quantity_in_stock")
    private Integer qtdEstoque;

    @ManyToMany
    @JoinTable(
            name = "category_product",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<CategoriaEntity> categorias = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private CarroDeComprasEntity carrinhoDeCompras;

}
