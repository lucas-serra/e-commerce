package com.lds.ecomerce.domain.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Table(name = "users")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 100)
    private String nome;

    @Column(length = 100)
    private String email;

    @Column(name = "password",length = 100)
    private String senha;

    @Column(name = "date_of_creation")
    private LocalDateTime dataCriacao;

    @Column(name = "date_of_atualization")
    private LocalDateTime dataAtualizacao;

    @OneToMany(mappedBy = "idUsuarioEntity")
    private List<VendaEntity> venda;

}
