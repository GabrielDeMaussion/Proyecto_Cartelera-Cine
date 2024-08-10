package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetGeneroDto;
import com.personal.carteleraCine.Entities.GeneroEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GeneroService {
    //METODOS PARA ENTIDADES
    GeneroEntity getGeneroEById(Long id);
    List<GeneroEntity> getAllGenerosEById(Long id);

    //METODOS PARA DTOS
    GetGeneroDto getById(Long id);
    List<GetGeneroDto> getAllById(Long id);
}
