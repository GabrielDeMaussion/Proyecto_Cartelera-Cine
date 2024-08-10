package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetDetalleDto;
import com.personal.carteleraCine.Entities.DetalleEntity;
import com.personal.carteleraCine.Repositories.DetalleRepository;
import com.personal.carteleraCine.Services.DetalleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleServiceImpl implements DetalleService {

    @Autowired
    DetalleRepository detalleRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<DetalleEntity> getAllDetallesEByCompra(Long idCompra) {
        return List.of();
    }

    @Override
    public DetalleEntity getDetalleEById(Long idDetalle) {
        return null;
    }

    @Override
    public List<GetDetalleDto> getAllDetallesByCompra(Long idCompra) {
        return List.of();
    }

    @Override
    public GetDetalleDto getDetalleById(Long idDetalle) {
        return null;
    }
}
