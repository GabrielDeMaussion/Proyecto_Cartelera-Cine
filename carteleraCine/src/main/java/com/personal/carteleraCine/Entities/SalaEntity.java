package com.personal.carteleraCine.Entities;

import com.personal.carteleraCine.Enums.TipoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "salas")
public class SalaEntity {
    @Id
    @GeneratedValue
    @Column(name = "id_sala")
    private Long idSala;

    @OneToMany(mappedBy = "sala")
    private List<ButacaEntity> lButacas;

    @ManyToOne
    @JoinColumn(name = "id_establecimiento")
    private EstablecimientoEntity establecimiento;

    @Column
    private TipoEnum tipo;
}
