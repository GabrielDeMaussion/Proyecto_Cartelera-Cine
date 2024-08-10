package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetFuncionDto;
import com.personal.carteleraCine.Dtos.Post.PostFuncionDto;
import com.personal.carteleraCine.Dtos.Put.PutFuncionDto;
import com.personal.carteleraCine.Entities.FuncionEntity;
import com.personal.carteleraCine.Enums.EstadoEnum;
import com.personal.carteleraCine.Repositories.FuncionRepository;
import com.personal.carteleraCine.Services.FuncionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionServiceImpl implements FuncionService {

    @Autowired
    FuncionRepository funcionRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<FuncionEntity> getAllFuncionesEDisponiblesByEstablecimiento(Long idEstablecimiento) {
        return List.of();
    }

    @Override
    public List<FuncionEntity> getAllFuncionesEDisponiblesByPelicula(Long idPelicula) {
        return List.of();
    }

    @Override
    public List<FuncionEntity> getAllFuncionesEDisponiblesByEstablecimientoAndPelicula(Long idEstablecimiento, Long idPelicula) {
        return List.of();
    }

    @Override
    public FuncionEntity getFuncionEById(Long idFuncion) {
        return null;
    }

    @Override
    public List<GetFuncionDto> getAllFuncionesDisponiblesByEstablecimiento(Long idEstablecimiento) {
        return List.of();
    }

    @Override
    public List<GetFuncionDto> getAllFuncionesDisponiblesByPelicula(Long idPelicula) {
        return List.of();
    }

    @Override
    public List<GetFuncionDto> getAllFuncionesDisponiblesByEstablecimientoAndPelicula(Long idEstablecimiento, Long idPelicula) {
        return List.of();
    }

    @Override
    public GetFuncionDto getFuncionById(Long idFuncion) {
        return null;
    }

    @Override
    public GetFuncionDto createFuncion(PostFuncionDto funcionDto) {
        return null;
    }

    @Override
    public GetFuncionDto updateFuncion(Long idFuncion, PutFuncionDto funcionDto) {
        return null;
    }

    @Override
    public GetFuncionDto updateEstadoFuncion(Long idFuncion, EstadoEnum estado) {
        return null;
    }
}
