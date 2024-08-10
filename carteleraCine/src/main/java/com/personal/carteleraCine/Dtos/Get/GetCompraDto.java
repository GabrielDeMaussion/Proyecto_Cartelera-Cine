package com.personal.carteleraCine.Dtos.Get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCompraDto {
    private Long idCompra;

    private Long idUsuario;

    private List<GetDetalleDto> lDetalles;

    private Double total;

    private GetVendedorDto vendedor;

    private Boolean anulada;
}
