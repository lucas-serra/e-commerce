package com.lds.ecomerce.domain.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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
