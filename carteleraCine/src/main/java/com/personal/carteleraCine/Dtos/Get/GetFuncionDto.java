package com.personal.carteleraCine.Dtos.Get;

import com.personal.carteleraCine.Enums.EstadoEnum;
import com.personal.carteleraCine.Enums.IdiomaEnum;
import com.personal.carteleraCine.Enums.SubEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetFuncionDto {
    private Long idFuncion;

    private GetPeliculaDto pelicula;

    private LocalDateTime fechaHora;

    private GetSalaDto sala;

    private IdiomaEnum idioma;

    private SubEnum subtitulada;

    private Boolean autoDescriptiva;

    private EstadoEnum estado;
}
