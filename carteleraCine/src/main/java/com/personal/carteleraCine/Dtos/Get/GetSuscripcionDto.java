package com.personal.carteleraCine.Dtos.Get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetSuscripcionDto {
    private Long idSuscripcion;

    private String nombre;

    private String descripcion;

    private Double precio;
}
