package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetComestibleDto;
import com.personal.carteleraCine.Dtos.Put.PutComestibleDto;
import com.personal.carteleraCine.Repositories.ComestibleRepository;
import com.personal.carteleraCine.Services.ComestibleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComestibleServiceImpl implements ComestibleService {

    @Autowired
    ComestibleRepository comestibleRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<GetComestibleDto> getAllComestiblesE() {
        return List.of();
    }

    @Override
    public GetComestibleDto getComestibleEById(Long idProducto) {
        return null;
    }

    @Override
    public List<GetComestibleDto> getAllComestibles() {
        return List.of();
    }

    @Override
    public GetComestibleDto getComestibleById(Long idProducto) {
        return null;
    }

    @Override
    public GetComestibleDto updateComestible(Long idProducto, PutComestibleDto comestibleDto) {
        return null;
    }

    @Override
    public Boolean borrarComestible(Long idProducto) {
        return null;
    }
}
