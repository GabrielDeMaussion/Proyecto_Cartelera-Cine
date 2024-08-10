package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetEntradaDto;
import com.personal.carteleraCine.Dtos.Post.PostEntradaDto;
import com.personal.carteleraCine.Entities.EntradaEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EntradaService {
    //Entidades
    List<EntradaEntity> getAllEntradasEByFuncion(Long idFuncion);
    List<EntradaEntity> getAllEntradasEByUsuario(Long idUsuario);
    EntradaEntity getEntradaEById(Long idEntrada);

    //DTOS
    List<GetEntradaDto> getAllEntradasByFuncion(Long idFuncion);
    List<GetEntradaDto> getAllEntradasByUsuario(Long idUsuario);
    GetEntradaDto getEntradaById(Long idEntrada);
    GetEntradaDto createEntrada(PostEntradaDto entradaDto);
    GetEntradaDto cancelarEntrada(Long idEntrada);


    //AUXILARES
}
