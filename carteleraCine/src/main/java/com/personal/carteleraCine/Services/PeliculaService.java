package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetPeliculaDto;
import com.personal.carteleraCine.Dtos.Post.PostPeliculaDto;
import com.personal.carteleraCine.Dtos.Put.PutPeliculaDto;
import com.personal.carteleraCine.Entities.PeliculaEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PeliculaService {
    //METODOS PARA ENTIDADES
    PeliculaEntity getPeliculaEById(Long id);
    List<PeliculaEntity> getAllPeliculasEById(Long id);

    //METODOS PARA DTOS
    GetPeliculaDto getById(Long id);
    List<GetPeliculaDto> getAllById(Long id);

    //AUXILARES
    GetPeliculaDto createPelicula(PostPeliculaDto peliculaDto);
    GetPeliculaDto updatePelicula(PutPeliculaDto peliculaDto);
    Boolean bajaPelicula(Long idPelicula);
}
