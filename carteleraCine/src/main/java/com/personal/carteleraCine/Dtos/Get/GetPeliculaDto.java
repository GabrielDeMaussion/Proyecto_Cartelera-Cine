package com.personal.carteleraCine.Dtos.Get;

import com.personal.carteleraCine.Enums.CategoriaEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPeliculaDto {
    private Long idPelicula;

    private String titulo;

    private CategoriaEnum categoria;

    private List<GetGeneroDto> lGeneros;

    private Duration duracion;

    private Boolean activo;
}
