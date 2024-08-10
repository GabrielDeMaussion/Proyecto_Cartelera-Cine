package com.personal.carteleraCine.Services;

import com.personal.carteleraCine.Entities.UsuarioEntity;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    //AUXILIARES(?
    <T extends UsuarioEntity> T iniciarSesion(String correo, String dni, String clave);
}
