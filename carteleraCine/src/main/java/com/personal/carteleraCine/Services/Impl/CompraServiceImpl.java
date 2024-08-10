package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetCompraDto;
import com.personal.carteleraCine.Dtos.Post.PostCompraDto;
import com.personal.carteleraCine.Entities.CompraEntity;
import com.personal.carteleraCine.Repositories.CompraRepository;
import com.personal.carteleraCine.Services.AdminService;
import com.personal.carteleraCine.Services.CompraService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {

    @Autowired
    CompraRepository compraRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<CompraEntity> getAllComprasEByUsuario(Long idUsuario) {
        return List.of();
    }

    @Override
    public CompraEntity getCompraEById(Long idCompra) {
        return null;
    }

    @Override
    public List<GetCompraDto> getAllComprasByUsuario(Long idUsuario) {
        return List.of();
    }

    @Override
    public GetCompraDto getComprEById(Long idCompra) {
        return null;
    }

    @Override
    public GetCompraDto createCompra(PostCompraDto compraDto) {
        return null;
    }

    @Override
    public Boolean bajaCompra(Long idCompra) {
        return null;
    }
}
