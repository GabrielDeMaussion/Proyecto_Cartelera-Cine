package com.personal.carteleraCine.Entities;

import com.personal.carteleraCine.Enums.ActivoEnum;
import com.personal.carteleraCine.Enums.IdiomaEnum;
import com.personal.carteleraCine.Enums.SubEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table( name = "funciones")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcion")
    private Long idFuncion;

    @ManyToOne
    @JoinColumn(name = "id_pelicula")
    private PeliculaEntity pelicula;

    @Column(name = "fecha_hora")
    private LocalDateTime fechaHora;

    @ManyToOne
    @JoinColumn(name = "id_sala")
    private SalaEntity sala;

    @Column
    private IdiomaEnum idioma;

    @Column
    private SubEnum subtitulada;

    @Column(name = "auto_descriptiva")
    private Boolean autoDescriptiva;

    @Column
    private ActivoEnum activo;
}
