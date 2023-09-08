package com.lds.ecomerce.domain.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Table(name = "category")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 100)
    private String nome;

    @ManyToMany(mappedBy = "categorias")
    Set<ProdutoEntity> produtos = new HashSet<>();

}
