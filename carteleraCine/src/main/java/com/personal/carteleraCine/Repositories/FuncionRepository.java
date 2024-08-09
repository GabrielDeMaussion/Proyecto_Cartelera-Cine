package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.FuncionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionRepository extends JpaRepository<FuncionEntity, Long> {
}
