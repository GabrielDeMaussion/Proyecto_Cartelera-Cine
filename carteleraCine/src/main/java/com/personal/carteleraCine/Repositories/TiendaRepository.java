package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.TiendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepository extends JpaRepository<TiendaEntity, Long> {
}
