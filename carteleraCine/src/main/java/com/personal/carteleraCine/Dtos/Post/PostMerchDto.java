package com.personal.carteleraCine.Dtos.Post;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostMerchDto {
    @NotBlank(message = "Este campo no puede estar vacío")
    private String nombre;

    @NotBlank(message = "Este campo no puede estar vacío")
    private String descripcion;

    @NotBlank(message = "Este campo no puede estar vacío")
    private Double precio;
}
