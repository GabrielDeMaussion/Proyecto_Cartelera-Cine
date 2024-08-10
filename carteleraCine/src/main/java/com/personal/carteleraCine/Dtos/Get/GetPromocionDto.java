package com.personal.carteleraCine.Dtos.Get;

import com.personal.carteleraCine.Enums.PromocionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPromocionDto {
    private Long idPromocion;

    private String nombre;

    private String descripcion;

    private LocalDateTime fechaHoraVigente;

    private PromocionEnum tipoPromocion;

    private Double valor;
}
