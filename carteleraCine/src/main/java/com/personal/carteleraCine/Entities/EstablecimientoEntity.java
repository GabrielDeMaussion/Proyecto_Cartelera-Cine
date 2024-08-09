package com.personal.carteleraCine.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table( name = "establecimientos")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstablecimientoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_establecimiento")
    private Long idEstablecimiento;

    @Column
    private String nombre;

    @Column
    private String direccion;

    @OneToMany(mappedBy = "establecimiento")
    List<SalaEntity> lSalas;


}
