package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetClienteDto;
import com.personal.carteleraCine.Dtos.Post.PostClienteDto;
import com.personal.carteleraCine.Dtos.Put.PutClienteDto;
import com.personal.carteleraCine.Entities.ClienteEntity;
import com.personal.carteleraCine.Repositories.ClienteRepository;
import com.personal.carteleraCine.Services.AdminService;
import com.personal.carteleraCine.Services.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<ClienteEntity> getAllClientesE() {
        return List.of();
    }

    @Override
    public ClienteEntity getClienteEById(Long idUsuario) {
        return null;
    }

    @Override
    public List<GetClienteDto> getAllClientes() {
        return List.of();
    }

    @Override
    public GetClienteDto getClienteById(Long idUsuario) {
        return null;
    }

    @Override
    public GetClienteDto createCliente(PostClienteDto clienteDto) {
        return null;
    }

    @Override
    public GetClienteDto updateCliente(PutClienteDto clienteDto) {
        return null;
    }
}
