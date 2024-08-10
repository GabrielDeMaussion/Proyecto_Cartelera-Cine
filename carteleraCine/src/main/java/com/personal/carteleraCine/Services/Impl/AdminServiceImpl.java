package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Dtos.Get.GetAdminDto;
import com.personal.carteleraCine.Entities.AdminEntity;
import com.personal.carteleraCine.Repositories.AdminRepository;
import com.personal.carteleraCine.Services.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<AdminEntity> getAllAdminsE() {
        return List.of();
    }

    @Override
    public AdminEntity getAdminEById(Long idUsuario) {
        return null;
    }

    @Override
    public List<GetAdminDto> getAllAdmins() {
        return List.of();
    }

    @Override
    public GetAdminDto getAdminById(Long idUsuario) {
        return null;
    }
}
