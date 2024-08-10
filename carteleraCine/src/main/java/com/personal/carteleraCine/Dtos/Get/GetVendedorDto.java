package com.personal.carteleraCine.Dtos.Get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetVendedorDto {
    private Long idVendedor;

    private String nombre;

    private String apellido;

    private String cargo;
}
