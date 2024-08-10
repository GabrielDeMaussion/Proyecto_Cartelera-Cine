package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetClienteDto;
import com.personal.carteleraCine.Dtos.Post.PostClienteDto;
import com.personal.carteleraCine.Dtos.Put.PutClienteDto;
import com.personal.carteleraCine.Entities.ButacaEntity;
import com.personal.carteleraCine.Entities.ClienteEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {
    //Entidades
    List<ClienteEntity> getAllClientesE();
    ClienteEntity getClienteEById(Long idUsuario);

    //DTOS
    List<GetClienteDto> getAllClientes();
    GetClienteDto getClienteById(Long idUsuario);
    GetClienteDto createCliente(PostClienteDto clienteDto);
    GetClienteDto updateCliente(PutClienteDto clienteDto);


    //AUXILARES
}
