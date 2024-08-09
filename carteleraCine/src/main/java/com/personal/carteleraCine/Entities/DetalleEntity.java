package com.personal.carteleraCine.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table( name = "detalles")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Long idDetalle;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private ProductoEntity producto;

    @Column
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "id_promocion")
    private PromocionEntity promocion;

    @Column
    private Double totalDescuento;

    @ManyToOne
    @JoinColumn(name = "id_compra")
    private CompraEntity compra;
}
