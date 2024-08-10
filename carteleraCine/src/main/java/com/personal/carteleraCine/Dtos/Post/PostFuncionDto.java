package com.personal.carteleraCine.Dtos.Post;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostFuncionDto {
    private Long idPelicula;

    @Future(message = "La fecha no puede ser anterior a la actual")
    private LocalDateTime fechaHora;

    @NotBlank(message = "Este campo no puede estar vacío")
    private Long idSala;

    @NotBlank(message = "Este campo no puede estar vacío")
    private Integer eIdioma;

    @NotBlank(message = "Este campo no puede estar vacío")
    private Integer eSubtitulada;

    @NotBlank(message = "Este campo no puede estar vacío")
    private Boolean autoDescriptiva;
}
