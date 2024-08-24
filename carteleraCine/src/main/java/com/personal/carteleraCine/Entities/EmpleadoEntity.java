package com.personal.carteleraCine.Entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@DiscriminatorValue("EMPLEADO")
public class EmpleadoEntity extends UsuarioEntity{
}
