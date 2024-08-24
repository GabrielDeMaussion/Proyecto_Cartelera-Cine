package com.personal.carteleraCine.Entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("MERCH")
public class MerchEntity extends ProductoEntity{
}
