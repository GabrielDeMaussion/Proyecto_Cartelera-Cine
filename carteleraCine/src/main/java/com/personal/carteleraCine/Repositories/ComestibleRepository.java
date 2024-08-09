package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.ComestibleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComestibleRepository extends JpaRepository<ComestibleEntity, Long> {
}
