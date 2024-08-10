package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    Boolean existsByCorreoOrDniAndClave(String correo, String dni, String clave);
}
