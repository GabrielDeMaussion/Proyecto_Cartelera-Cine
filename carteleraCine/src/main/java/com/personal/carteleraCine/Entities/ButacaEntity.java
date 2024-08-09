package com.personal.carteleraCine.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "butacas")
public class ButacaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_butaca")
    private Long idButaca;

    @Column
    private Character fila;

    @Column(name = "nro_asiento")
    private Integer nroAsiento;

    @ManyToOne
    @JoinColumn(name = "id_sala")
    private SalaEntity sala;
}
