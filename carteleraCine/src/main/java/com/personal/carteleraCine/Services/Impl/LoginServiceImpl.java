package com.personal.carteleraCine.Services.Impl;

import com.personal.carteleraCine.Entities.UsuarioEntity;
import com.personal.carteleraCine.Repositories.UsuarioRepository;
import com.personal.carteleraCine.Services.LoginService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public <T extends UsuarioEntity> T iniciarSesion(String correo, String dni, String clave) {
        return null;
    }
}
