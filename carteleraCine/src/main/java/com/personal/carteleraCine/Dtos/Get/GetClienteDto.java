package com.personal.carteleraCine.Dtos.Get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetClienteDto {
    private Long idUsuario;

    private String correo;

    private String nombre;

    private String apellido;

    private String dni;

    private LocalDate fechaNacimiento;

    private GetSuscripcionDto suscripcion;

    private Integer puntos;
}
