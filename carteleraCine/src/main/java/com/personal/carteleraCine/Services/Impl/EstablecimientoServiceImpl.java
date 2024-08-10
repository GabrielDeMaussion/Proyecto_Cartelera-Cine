package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetEstablecimientoDto;
import com.personal.carteleraCine.Entities.EstablecimientoEntity;
import com.personal.carteleraCine.Repositories.EstablecimientoRepository;
import com.personal.carteleraCine.Services.EstablecimientoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstablecimientoServiceImpl implements EstablecimientoService {

    @Autowired
    EstablecimientoRepository establecimientoRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<EstablecimientoEntity> getAllEstablecimientosE() {
        return List.of();
    }

    @Override
    public EstablecimientoEntity getEstablecimientoEById(Long idEstablecimiento) {
        return null;
    }

    @Override
    public List<GetEstablecimientoDto> getAllEstablecimientos() {
        return List.of();
    }

    @Override
    public GetEstablecimientoDto getEstablecimientoById(Long idEstablecimiento) {
        return null;
    }
}
