package com.personal.carteleraCine.Dtos.Post;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostCompraDto {
    @NotBlank(message = "Este campo no puede estar vacío")
    private Long idUsuario;

    @NotBlank(message = "Este campo no puede estar vacío")
    private List<PostDetalleDto> lDetalles;
}
