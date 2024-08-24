package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.ButacaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ButacaRepository extends JpaRepository<ButacaEntity, Long> {
}
