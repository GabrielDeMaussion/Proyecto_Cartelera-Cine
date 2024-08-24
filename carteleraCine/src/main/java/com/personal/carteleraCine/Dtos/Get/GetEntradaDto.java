package com.personal.carteleraCine.Dtos.Get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetEntradaDto {
    private Long idProducto;

    private String nombre;

    private String descripcion;

    private Double precio;

    private Boolean activo;

    private GetButacaDto butaca;

    private GetFuncionDto funcion;
}
