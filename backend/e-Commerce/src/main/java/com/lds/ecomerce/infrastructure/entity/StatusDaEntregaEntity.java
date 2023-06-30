package com.lds.ecomerce.infrastructure.entity;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Entity
@Table(name = "status_delivery")
@NoArgsConstructor
@EqualsAndHashCode
public class StatusDaEntregaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String status;

}
