package com.personal.carteleraCine.Dtos.Post;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDetalleDto {
    @NotBlank(message = "Este campo no puede estar vacío")
    private Long idProducto;

    @Min(value = 1, message = "Debe ingresar como mínimo un producto")
    private Integer cantidad;

    @NotBlank(message = "Este campo no puede estar vacío")
    private Long idPromocion;
}
