package com.personal.carteleraCine.Dtos.Put;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PutEmpleadoDto {
    private String nombre;

    private String apellido;
}
