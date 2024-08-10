package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetEstablecimientoDto;
import com.personal.carteleraCine.Entities.EstablecimientoEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EstablecimientoService {
    //Entidades
    List<EstablecimientoEntity> getAllEstablecimientosE();
    EstablecimientoEntity getEstablecimientoEById(Long idEstablecimiento);


    //DTOS
    List<GetEstablecimientoDto> getAllEstablecimientos();
    GetEstablecimientoDto getEstablecimientoById(Long idEstablecimiento);


    //AUXILARES
}
