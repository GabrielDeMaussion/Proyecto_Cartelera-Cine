package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetFuncionDto;
import com.personal.carteleraCine.Dtos.Post.PostFuncionDto;
import com.personal.carteleraCine.Dtos.Put.PutFuncionDto;
import com.personal.carteleraCine.Entities.FuncionEntity;
import com.personal.carteleraCine.Enums.EstadoEnum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FuncionService {
    //Entidades
    List<FuncionEntity> getAllFuncionesEDisponiblesByEstablecimiento(Long idEstablecimiento);
    List<FuncionEntity> getAllFuncionesEDisponiblesByPelicula(Long idPelicula);
    List<FuncionEntity> getAllFuncionesEDisponiblesByEstablecimientoAndPelicula(Long idEstablecimiento, Long idPelicula);
    FuncionEntity getFuncionEById(Long idFuncion);


    //DTOS
    List<GetFuncionDto> getAllFuncionesDisponiblesByEstablecimiento(Long idEstablecimiento);
    List<GetFuncionDto> getAllFuncionesDisponiblesByPelicula(Long idPelicula);
    List<GetFuncionDto> getAllFuncionesDisponiblesByEstablecimientoAndPelicula(Long idEstablecimiento, Long idPelicula);
    GetFuncionDto getFuncionById(Long idFuncion);
    GetFuncionDto createFuncion(PostFuncionDto funcionDto);
    GetFuncionDto updateFuncion(Long idFuncion, PutFuncionDto funcionDto);
    GetFuncionDto updateEstadoFuncion(Long idFuncion, EstadoEnum estado);


    //AUXILARES
}
