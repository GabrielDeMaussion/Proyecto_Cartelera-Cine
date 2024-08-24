package com.personal.carteleraCine.Dtos.Get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetDetalleDto {
    private Long idDetalle;

    private GetMerchDto producto;

    private Integer cantidad;

    private GetPromocionDto promocion;

    private Double totalDescuento;
}
