package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetMerchDto;
import com.personal.carteleraCine.Dtos.Put.PutMerchDto;
import com.personal.carteleraCine.Entities.MerchEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MerchService {
    //METODOS PARA ENTIDADES
    MerchEntity getMerchEById(Long id);
    List<MerchEntity> getAllMerchsEById(Long id);

    //METODOS PARA DTOS
    GetMerchDto getById(Long id);
    List<GetMerchDto> getAllById(Long id);

    //AUXILIAR
    GetMerchDto updateMerch(PutMerchDto merchDto);
    Boolean bajaMerch(Long idMerch);

}
