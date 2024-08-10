package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetButacaDto;
import com.personal.carteleraCine.Entities.ButacaEntity;
import com.personal.carteleraCine.Repositories.ButacaRepository;
import com.personal.carteleraCine.Services.AdminService;
import com.personal.carteleraCine.Services.ButacaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ButacaServiceImpl implements ButacaService {

    @Autowired
    ButacaRepository butacaRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<ButacaEntity> getAllButacasEFromSala(Long idSala) {
        return List.of();
    }

    @Override
    public ButacaEntity getButacaEById(Long idButaca) {
        return null;
    }

    @Override
    public List<ButacaEntity> getAllButacasFromSala(Long idSala) {
        return List.of();
    }

    @Override
    public GetButacaDto getButacaById(Long idButaca) {
        return null;
    }
}
