package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetComestibleDto;
import com.personal.carteleraCine.Dtos.Put.PutComestibleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComestibleService {
    //Entidades
    List<GetComestibleDto> getAllComestiblesE();
    GetComestibleDto getComestibleEById(Long idProducto);


    //DTOS
    List<GetComestibleDto> getAllComestibles();
    GetComestibleDto getComestibleById(Long idProducto);
    GetComestibleDto updateComestible(Long idProducto, PutComestibleDto comestibleDto);
    Boolean borrarComestible(Long idProducto);

    //AUXILARES
}
