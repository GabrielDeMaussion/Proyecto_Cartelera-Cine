package com.personal.carteleraCine.Dtos.Get;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetComestibleDto {
    private Long idProducto;

    private String nombre;

    private String descripcion;

    private Double precio;
}
