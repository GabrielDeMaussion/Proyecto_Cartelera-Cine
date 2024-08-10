package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetSuscripcionDto;
import com.personal.carteleraCine.Entities.SuscripcionEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SuscripcionService {
    //METODOS PARA ENTIDADES
    SuscripcionEntity getSuscripcionEById(Long id);
    List<SuscripcionEntity> getAllSuscripcionesEById(Long id);

    //METODOS PARA DTOS
    GetSuscripcionDto getById(Long id);
    List<GetSuscripcionDto> getAllById(Long id);
}
