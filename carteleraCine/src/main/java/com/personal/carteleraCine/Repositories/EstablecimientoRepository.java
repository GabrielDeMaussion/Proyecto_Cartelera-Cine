package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.EstablecimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstablecimientoRepository extends JpaRepository<EstablecimientoEntity, Long> {
}
