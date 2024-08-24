package com.personal.carteleraCine.Entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@DiscriminatorValue("COMESTIBLES")
public class ComestibleEntity extends ProductoEntity{
}
