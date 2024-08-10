package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetSalaDto;
import com.personal.carteleraCine.Entities.SalaEntity;
import com.personal.carteleraCine.Repositories.SalaRepository;
import com.personal.carteleraCine.Services.SalaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaServiceImpl implements SalaService {

    @Autowired
    SalaRepository salaRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public SalaEntity getSalaEById(Long id) {
        return null;
    }

    @Override
    public List<SalaEntity> getAllSalasEById(Long id) {
        return List.of();
    }

    @Override
    public GetSalaDto getById(Long id) {
        return null;
    }

    @Override
    public List<GetSalaDto> getAllById(Long id) {
        return List.of();
    }
}
