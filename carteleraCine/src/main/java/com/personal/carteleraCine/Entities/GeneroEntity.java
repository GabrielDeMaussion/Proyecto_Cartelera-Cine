package com.personal.carteleraCine.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table( name = "generos")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_genero")
    private Long idGenero;

    @Column
    private String nombre;
}
