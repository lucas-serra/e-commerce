package com.lds.ecomerce.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
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

    @Column(name = "road")
    private String rua;

    @Column(name = "number")
    private Integer numero;

    @Column(name = "city")
    private String cidade;

    @Column(name = "postal_code")
    private String cep;

    @ManyToMany(mappedBy = "enderecos")
    private Set<UsuarioEntity> usuarios = new HashSet<>();

}
