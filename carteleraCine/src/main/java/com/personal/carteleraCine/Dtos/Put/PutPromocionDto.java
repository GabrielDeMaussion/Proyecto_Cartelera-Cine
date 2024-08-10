package com.personal.carteleraCine.Dtos.Put;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PutPromocionDto {
    private String nombre;

    private String descripcion;

    private LocalDateTime fechaHoraVigente;

    private Integer eTipoPromocion;

    private Double valor;
}
