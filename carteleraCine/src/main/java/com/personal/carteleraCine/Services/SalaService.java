package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetSalaDto;
import com.personal.carteleraCine.Dtos.Get.GetSuscripcionDto;
import com.personal.carteleraCine.Entities.SalaEntity;
import com.personal.carteleraCine.Entities.SuscripcionEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SalaService {
    //METODOS PARA ENTIDADES
    SalaEntity getSalaEById(Long id);
    List<SalaEntity> getAllSalasEById(Long id);

    //METODOS PARA DTOS
    GetSalaDto getById(Long id);
    List<GetSalaDto> getAllById(Long id);
}
