package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetPromocionDto;
import com.personal.carteleraCine.Dtos.Post.PostPromocionDto;
import com.personal.carteleraCine.Dtos.Put.PutPromocionDto;
import com.personal.carteleraCine.Entities.PromocionEntity;
import com.personal.carteleraCine.Repositories.PromocionRepository;
import com.personal.carteleraCine.Services.PromocionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionServiceImpl implements PromocionService {

    @Autowired
    PromocionRepository promocionRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public PromocionEntity getPromocionEById(Long id) {
        return null;
    }

    @Override
    public List<PromocionEntity> getAllPromocionesEEntitiesById(Long id) {
        return List.of();
    }

    @Override
    public GetPromocionDto getById(Long id) {
        return null;
    }

    @Override
    public List<GetPromocionDto> getAllById(Long id) {
        return List.of();
    }

    @Override
    public GetPromocionDto createPromocion(PostPromocionDto promocionDto) {
        return null;
    }

    @Override
    public GetPromocionDto updatePromocion(PutPromocionDto promocionDto) {
        return null;
    }
}
