package com.lds.ecomerce.infrastructure.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Table(name = "sales")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class VendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "shopping_cart_id")
    private CarroDeComprasEntity idCarroDeComprasEntity;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UsuarioEntity idUsuarioEntity;

    @OneToOne
    @JoinColumn(name = "form_of_payment_id")
    private FormaPagamentoEntity idFormaPagamentoEntity;

    @OneToMany
    @JoinColumn(name = "status_delivery_id")
    private StatusDaEntregaEntity idStatusEntregaEntity;

    @OneToOne
    @JoinColumn(name = "adress_id")
    private EnderecoEntity idEnderecoEntity;

}
