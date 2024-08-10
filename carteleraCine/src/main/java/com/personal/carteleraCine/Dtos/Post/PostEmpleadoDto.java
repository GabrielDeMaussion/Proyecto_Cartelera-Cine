package com.personal.carteleraCine.Dtos.Post;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostEmpleadoDto {
    @NotBlank(message = "Este campo no puede quedar vacío")
    @Email(message = "Formato no válido")
    private String correo;

    @NotBlank
    @Size(min = 8, message = "Mínimo 8 carácteres")
    private String contraseña;

    @NotBlank
    @Size(max = 50, message = "Máximo 50 carácteres")
    private String nombre;

    @NotBlank
    @Size(max = 30, message = "Máximo 30 carácteres")
    private String apellido;

    @NotBlank(message = "Este campo no puede estar vacío")
    private String dni;

    @NotBlank(message = "Este campo no puede estar vacío")
    private LocalDate fechaNacimiento;

}
