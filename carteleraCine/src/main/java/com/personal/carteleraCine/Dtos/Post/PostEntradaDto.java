package com.personal.carteleraCine.Dtos.Post;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostEntradaDto {
    @NotBlank(message = "Este campo no puede estar vacío")
    private Long idButaca;

    @NotBlank(message = "Este campo no puede estar vacío")
    private Long idFuncion;
}
