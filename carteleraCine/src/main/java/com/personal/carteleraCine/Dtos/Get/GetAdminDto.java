package com.personal.carteleraCine.Dtos.Get;

import com.personal.carteleraCine.Entities.CompraEntity;
import com.personal.carteleraCine.Enums.AuthEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAdminDto {
    private Long idUsuario;

    private String correo;

    private String nombre;

    private String apellido;

    private String dni;

    private List<CompraEntity> lCompras;

    private Boolean activo;

    private AuthEnum autorizacion;
}
