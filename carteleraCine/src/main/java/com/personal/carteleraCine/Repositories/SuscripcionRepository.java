package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.SuscripcionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuscripcionRepository extends JpaRepository<SuscripcionEntity, Long> {
}
