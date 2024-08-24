package com.personal.carteleraCine.Dtos.Put;

import com.personal.carteleraCine.Entities.SalaEntity;
import com.personal.carteleraCine.Enums.IdiomaEnum;
import com.personal.carteleraCine.Enums.SubEnum;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PutFuncionDto {
    private Long idPelicula;

    private LocalDateTime fechaHora;

    private Long sala;

    private Integer eIdioma;

    private Integer eSubtitulada;

    private Boolean autoDescriptiva;
}
