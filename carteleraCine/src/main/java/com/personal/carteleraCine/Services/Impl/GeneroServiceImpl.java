package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetGeneroDto;
import com.personal.carteleraCine.Entities.GeneroEntity;
import com.personal.carteleraCine.Repositories.GeneroRepository;
import com.personal.carteleraCine.Services.GeneroService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {

    @Autowired
    GeneroRepository generoRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public GeneroEntity getGeneroEById(Long id) {
        return null;
    }

    @Override
    public List<GeneroEntity> getAllGenerosEById(Long id) {
        return List.of();
    }

    @Override
    public GetGeneroDto getById(Long id) {
        return null;
    }

    @Override
    public List<GetGeneroDto> getAllById(Long id) {
        return List.of();
    }
}
