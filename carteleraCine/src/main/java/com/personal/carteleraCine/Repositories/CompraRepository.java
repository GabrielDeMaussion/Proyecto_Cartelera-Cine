package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.CompraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<CompraEntity, Long> {
}
