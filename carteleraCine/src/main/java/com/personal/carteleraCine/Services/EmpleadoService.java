package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetEmpleadoDto;
import com.personal.carteleraCine.Dtos.Post.PostEmpleadoDto;
import com.personal.carteleraCine.Dtos.Put.PutEmpleadoDto;
import com.personal.carteleraCine.Entities.EmpleadoEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpleadoService {
    //Entidades
    List<EmpleadoEntity> getAllEmpleadosE();
    EmpleadoEntity getEmpleadoEById(Long idUsuario);


    //DTOS
    List<GetEmpleadoDto> getAllEmpleados();
    GetEmpleadoDto getEmpleadoById(Long idUsuario);
    GetEmpleadoDto createEmpleado(PostEmpleadoDto empleadoDto);
    GetEmpleadoDto updateEmpleado(Long idUsuario, PutEmpleadoDto empleadoDto);


    //AUXILARES
}
