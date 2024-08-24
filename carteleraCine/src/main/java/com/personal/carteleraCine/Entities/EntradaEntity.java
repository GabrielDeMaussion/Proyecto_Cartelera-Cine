package com.personal.carteleraCine.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@DiscriminatorValue("ENTRADA")
public class EntradaEntity extends ProductoEntity{

    @ManyToOne
    @JoinColumn(name = "id_butaca")
    private ButacaEntity butaca;

    @ManyToOne
    @JoinColumn(name = "id_funcion")
    private FuncionEntity funcion;

}
