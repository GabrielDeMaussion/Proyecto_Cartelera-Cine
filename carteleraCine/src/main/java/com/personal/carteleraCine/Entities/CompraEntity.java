package com.personal.carteleraCine.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Table( name = "compras")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Long idCompra;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuario;

    @Column(name = "fecha_hora_compra")
    private LocalDateTime fechaHoraCompra;

    @OneToMany(mappedBy = "compra")
    private List<DetalleEntity> lDetalles;

    @Column
    private Double total;
}
