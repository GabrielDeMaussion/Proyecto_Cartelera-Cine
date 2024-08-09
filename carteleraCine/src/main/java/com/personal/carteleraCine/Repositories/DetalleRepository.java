package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.DetalleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleRepository extends JpaRepository<DetalleEntity, Long> {
}
