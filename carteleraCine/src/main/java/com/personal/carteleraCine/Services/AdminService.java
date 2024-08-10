package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Dtos.Get.GetAdminDto;
import com.personal.carteleraCine.Dtos.Get.GetButacaDto;
import com.personal.carteleraCine.Entities.AdminEntity;
import com.personal.carteleraCine.Entities.ButacaEntity;
import com.personal.carteleraCine.Repositories.AdminRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    //Entidades
    List<AdminEntity> getAllAdminsE();
    AdminEntity getAdminEById(Long idUsuario);


    //DTOS
    List<GetAdminDto> getAllAdmins();
    GetAdminDto getAdminById(Long idUsuario);


    //AUXILARES

}
