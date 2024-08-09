package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.EntradaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaRepository extends JpaRepository<EntradaEntity, Long> {
}
