package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.SalaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends JpaRepository<SalaEntity, Long> {
}
