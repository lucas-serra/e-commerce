package com.lds.ecomerce.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Table(name = "adress")
@Entity
@EqualsAndHashCode(of = "id")
@Setter
@NoArgsConstructor
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "road",length = 255)
    private String rua;

    @Column(name = "number")
    private Integer numero;

    @Column(name = "city",length = 100)
    private String cidade;

    @Column(name = "postal_code",length = 11)
    private String cep;

    @OneToMany(mappedBy = "idEnderecoEntity")
    private List<VendaEntity> venda = new ArrayList<>();

}
