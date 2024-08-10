package com.personal.carteleraCine.Dtos.Get;

import com.personal.carteleraCine.Enums.TipoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetSalaDto {
    private Long idSala;

    private List<GetButacaDto> lButacas;

    private TipoEnum tipo;
}
