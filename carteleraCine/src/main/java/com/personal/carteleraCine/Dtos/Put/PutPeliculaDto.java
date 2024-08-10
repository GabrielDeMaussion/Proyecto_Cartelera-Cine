package com.personal.carteleraCine.Dtos.Put;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PutPeliculaDto {
    private String titulo;

    private Integer categoria;

    private List<Long> lIdGeneros;

    private Duration duracion;
}
