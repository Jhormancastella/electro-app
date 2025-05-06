package com.electroapp.electro_app.domain.entities;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "tercero_id", nullable = false)
    private Tercero tercero;

    private Double porcentaje;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "arl_id")
    @JsonBackReference
    private Arl arl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eps_id")
    @JsonBackReference
    private Eps eps;

    @Embedded
    private Audit audit = new Audit();
}