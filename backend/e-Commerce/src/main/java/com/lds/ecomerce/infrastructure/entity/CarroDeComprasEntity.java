package com.lds.ecomerce.infrastructure.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Table(name = "shopping_cart")
@NoArgsConstructor
@EqualsAndHashCode
public class CarroDeComprasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "product_id")
    private ProdutoEntity idProdutoEntity;

}
