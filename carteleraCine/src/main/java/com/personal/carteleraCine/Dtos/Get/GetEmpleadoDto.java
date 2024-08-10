package com.personal.carteleraCine.Dtos.Get;

import com.personal.carteleraCine.Entities.CompraEntity;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetEmpleadoDto {
    private Long idUsuario;

    private String correo;

    private String contraseña;

    private String nombre;

    private String apellido;

    private String dni;

    private List<CompraEntity> lCompras;

    private Boolean activo;
}
