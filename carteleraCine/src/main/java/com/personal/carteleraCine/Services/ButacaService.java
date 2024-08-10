package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetButacaDto;
import com.personal.carteleraCine.Entities.ButacaEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ButacaService {

    //Entidades
    List<ButacaEntity> getAllButacasEFromSala(Long idSala);
    ButacaEntity getButacaEById(Long idButaca);


    //DTOS
    List<ButacaEntity> getAllButacasFromSala(Long idSala);
    GetButacaDto getButacaById(Long idButaca);


    //AUXILARES
}
