package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetEmpleadoDto;
import com.personal.carteleraCine.Dtos.Post.PostEmpleadoDto;
import com.personal.carteleraCine.Dtos.Put.PutEmpleadoDto;
import com.personal.carteleraCine.Entities.EmpleadoEntity;
import com.personal.carteleraCine.Repositories.EmpleadoRepository;
import com.personal.carteleraCine.Services.EmpleadoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<EmpleadoEntity> getAllEmpleadosE() {
        return List.of();
    }

    @Override
    public EmpleadoEntity getEmpleadoEById(Long idUsuario) {
        return null;
    }

    @Override
    public List<GetEmpleadoDto> getAllEmpleados() {
        return List.of();
    }

    @Override
    public GetEmpleadoDto getEmpleadoById(Long idUsuario) {
        return null;
    }

    @Override
    public GetEmpleadoDto createEmpleado(PostEmpleadoDto empleadoDto) {
        return null;
    }

    @Override
    public GetEmpleadoDto updateEmpleado(Long idUsuario, PutEmpleadoDto empleadoDto) {
        return null;
    }
}
