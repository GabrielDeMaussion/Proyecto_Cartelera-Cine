package com.personal.carteleraCine.Dtos.Post;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostPeliculaDto {
    @NotBlank(message = "Este campo no puede estar vacío")
    private String titulo;

    @NotBlank(message = "Este campo no puede estar vacío")
    private int categoria;

    @NotBlank(message = "Este campo no puede estar vacío")
    private List<Long> lIdGeneros;

    @NotBlank(message = "Este campo no puede estar vacío")
    private Duration duracion;

    private Boolean activo;
}
