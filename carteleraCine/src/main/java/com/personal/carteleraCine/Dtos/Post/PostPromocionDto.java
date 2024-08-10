package com.personal.carteleraCine.Dtos.Post;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostPromocionDto {
    @NotBlank(message = "Este campo no puede estar vacío")
    private String nombre;

    @NotBlank(message = "Este campo no puede estar vacío")
    private String descripcion;

    @Future
    @NotBlank(message = "Este campo no puede estar vacío")
    private LocalDateTime fechaHoraVigente;

    @NotBlank(message = "Este campo no puede estar vacío")
    private Integer eTipoPromocion;

    @NotBlank(message = "Este campo no puede estar vacío")
    private Double valor;
}
