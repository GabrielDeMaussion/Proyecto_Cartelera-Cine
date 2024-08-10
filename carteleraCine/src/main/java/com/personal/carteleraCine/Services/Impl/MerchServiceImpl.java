package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetMerchDto;
import com.personal.carteleraCine.Dtos.Put.PutMerchDto;
import com.personal.carteleraCine.Entities.MerchEntity;
import com.personal.carteleraCine.Repositories.MerchRepository;
import com.personal.carteleraCine.Services.MerchService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchServiceImpl implements MerchService {

    @Autowired
    MerchRepository merchRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public MerchEntity getMerchEById(Long id) {
        return null;
    }

    @Override
    public List<MerchEntity> getAllMerchsEById(Long id) {
        return List.of();
    }

    @Override
    public GetMerchDto getById(Long id) {
        return null;
    }

    @Override
    public List<GetMerchDto> getAllById(Long id) {
        return List.of();
    }

    @Override
    public GetMerchDto updateMerch(PutMerchDto merchDto) {
        return null;
    }

    @Override
    public Boolean bajaMerch(Long idMerch) {
        return null;
    }
}
