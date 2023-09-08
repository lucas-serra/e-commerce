package com.lds.ecomerce.domain.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsuarioEntity idUsuarioEntity;

    @OneToOne
    @JoinColumn(name = "form_of_payment_id")
    private FormaPagamentoEntity idFormaPagamentoEntity;

    @OneToMany(mappedBy = "venda")
    private List<StatusDaEntregaEntity> idStatusEntregaEntity = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "adress_id")
    private EnderecoEntity idEnderecoEntity;

}
