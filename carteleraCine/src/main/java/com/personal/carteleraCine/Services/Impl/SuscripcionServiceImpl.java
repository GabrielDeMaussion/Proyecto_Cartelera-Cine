package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetSuscripcionDto;
import com.personal.carteleraCine.Entities.SuscripcionEntity;
import com.personal.carteleraCine.Repositories.SuscripcionRepository;
import com.personal.carteleraCine.Services.SuscripcionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuscripcionServiceImpl implements SuscripcionService {

    @Autowired
    SuscripcionRepository suscripcionRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public SuscripcionEntity getSuscripcionEById(Long id) {
        return null;
    }

    @Override
    public List<SuscripcionEntity> getAllSuscripcionesEById(Long id) {
        return List.of();
    }

    @Override
    public GetSuscripcionDto getById(Long id) {
        return null;
    }

    @Override
    public List<GetSuscripcionDto> getAllById(Long id) {
        return List.of();
    }
}
