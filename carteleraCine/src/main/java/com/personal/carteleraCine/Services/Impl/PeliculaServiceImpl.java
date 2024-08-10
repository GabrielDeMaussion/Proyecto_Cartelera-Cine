package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetPeliculaDto;
import com.personal.carteleraCine.Dtos.Post.PostPeliculaDto;
import com.personal.carteleraCine.Dtos.Put.PutPeliculaDto;
import com.personal.carteleraCine.Entities.PeliculaEntity;
import com.personal.carteleraCine.Repositories.PeliculaRepository;
import com.personal.carteleraCine.Services.PeliculaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    PeliculaRepository peliculaRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public PeliculaEntity getPeliculaEById(Long id) {
        return null;
    }

    @Override
    public List<PeliculaEntity> getAllPeliculasEById(Long id) {
        return List.of();
    }

    @Override
    public GetPeliculaDto getById(Long id) {
        return null;
    }

    @Override
    public List<GetPeliculaDto> getAllById(Long id) {
        return List.of();
    }

    @Override
    public GetPeliculaDto createPelicula(PostPeliculaDto peliculaDto) {
        return null;
    }

    @Override
    public GetPeliculaDto updatePelicula(PutPeliculaDto peliculaDto) {
        return null;
    }

    @Override
    public Boolean bajaPelicula(Long idPelicula) {
        return null;
    }
}
