package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetEntradaDto;
import com.personal.carteleraCine.Dtos.Post.PostEntradaDto;
import com.personal.carteleraCine.Entities.EntradaEntity;
import com.personal.carteleraCine.Repositories.EntradaRepository;
import com.personal.carteleraCine.Services.EntradaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntradaServiceImpl implements EntradaService {

    @Autowired
    EntradaRepository entradaRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<EntradaEntity> getAllEntradasEByFuncion(Long idFuncion) {
        return List.of();
    }

    @Override
    public List<EntradaEntity> getAllEntradasEByUsuario(Long idUsuario) {
        return List.of();
    }

    @Override
    public EntradaEntity getEntradaEById(Long idEntrada) {
        return null;
    }

    @Override
    public List<GetEntradaDto> getAllEntradasByFuncion(Long idFuncion) {
        return List.of();
    }

    @Override
    public List<GetEntradaDto> getAllEntradasByUsuario(Long idUsuario) {
        return List.of();
    }

    @Override
    public GetEntradaDto getEntradaById(Long idEntrada) {
        return null;
    }

    @Override
    public GetEntradaDto createEntrada(PostEntradaDto entradaDto) {
        return null;
    }

    @Override
    public GetEntradaDto cancelarEntrada(Long idEntrada) {
        return null;
    }
}
