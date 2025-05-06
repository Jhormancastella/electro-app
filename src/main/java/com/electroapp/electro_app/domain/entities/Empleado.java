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
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "tercero_id", nullable = false)
    private Tercero tercero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "arl_id")
    @JsonBackReference
    private Arl arl;

    @Column(name = "fecha_contratacion")
    private Date fechaContratacion;

    @Column(name = "salario_base")
    private Double salarioBase;

    @Embedded
    private Audit audit = new Audit();
}