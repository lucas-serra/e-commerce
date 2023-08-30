package com.lds.ecomerce.infrastructure.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Setter
@Table(name = "shopping_cart")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class CarroDeComprasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "carrinhoDeCompras")
    private List<ProdutoEntity> idProdutoEntity = new ArrayList<>();

}
