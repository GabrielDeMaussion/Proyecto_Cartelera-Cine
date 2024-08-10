package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetPromocionDto;
import com.personal.carteleraCine.Dtos.Post.PostPromocionDto;
import com.personal.carteleraCine.Dtos.Put.PutPromocionDto;
import com.personal.carteleraCine.Entities.PromocionEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PromocionService {
    //METODOS PARA ENTIDADES
    PromocionEntity getPromocionEById(Long id);
    List<PromocionEntity> getAllPromocionesEEntitiesById(Long id);

    //METODOS PARA DTOS
    GetPromocionDto getById(Long id);
    List<GetPromocionDto> getAllById(Long id);

    //AUXILARES
    GetPromocionDto createPromocion(PostPromocionDto promocionDto);
    GetPromocionDto updatePromocion(PutPromocionDto promocionDto);
}
