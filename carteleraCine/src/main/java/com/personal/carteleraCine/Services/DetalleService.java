package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetDetalleDto;
import com.personal.carteleraCine.Entities.DetalleEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DetalleService {
    //Entidades
    List<DetalleEntity> getAllDetallesEByCompra(Long idCompra);
    DetalleEntity getDetalleEById(Long idDetalle);


    //DTOS
    List<GetDetalleDto> getAllDetallesByCompra(Long idCompra);
    GetDetalleDto getDetalleById(Long idDetalle);


    //AUXILARES
}
