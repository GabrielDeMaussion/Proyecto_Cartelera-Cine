package com.personal.carteleraCine.Dtos.Get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetButacaEstadoDto {
    private Long idButaca;

    private Character fila;

    private Integer nroAsiento;

    private Boolean libre;
}
