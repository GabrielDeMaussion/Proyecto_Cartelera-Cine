package com.personal.carteleraCine.Entities;

import com.personal.carteleraCine.Enums.PromocionEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table( name = "promociones")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromocionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_promocion")
    private Long idPromocion;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column(name = "fecha_hora_vigente")
    private LocalDateTime fechaHoraVigente;

    @Column(name = "tipo_promocion")
    private PromocionEnum tipoPromocion;

    @Column
    private Double valor;
}
