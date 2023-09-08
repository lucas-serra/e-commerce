package com.lds.ecomerce.domain.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@NoArgsConstructor
@Table(name = "category_product")
@EqualsAndHashCode(of = "id")
public class CategoriaProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoriaEntity idCategoria;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProdutoEntity idProduto;

}
