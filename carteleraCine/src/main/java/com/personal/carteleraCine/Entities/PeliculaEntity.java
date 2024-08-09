package com.personal.carteleraCine.Entities;

import com.personal.carteleraCine.Enums.CategoriaEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.List;


@Table( name = "peliculas")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeliculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Long idPelicula;

    @Column
    private String titulo;

    @Column
    private CategoriaEnum categoria;

    @OneToMany
    List<GeneroEntity> lGeneros;

    @Column
    private Duration duracion;

    @Column
    private Boolean activo;
}
