package com.personal.carteleraCine.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@DiscriminatorValue("CLIENTE")
public class ClienteEntity extends UsuarioEntity{

    @ManyToOne
    @JoinColumn(name = "id_suscripcion")
    private SuscripcionEntity suscripcion;

    @Column
    private Integer puntos;

    @Column(name = "fecha_nac")
    private LocalDate fechaNacimiento;
}
