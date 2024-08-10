package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetCompraDto;
import com.personal.carteleraCine.Dtos.Post.PostCompraDto;
import com.personal.carteleraCine.Entities.CompraEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompraService {
    //Entidades
    List<CompraEntity> getAllComprasEByUsuario(Long idUsuario);
    CompraEntity getCompraEById(Long idCompra);


    //DTOS
    List<GetCompraDto> getAllComprasByUsuario(Long idUsuario);
    GetCompraDto getComprEById(Long idCompra);
    GetCompraDto createCompra(PostCompraDto compraDto);
    Boolean bajaCompra(Long idCompra);


    //AUXILARES
}
