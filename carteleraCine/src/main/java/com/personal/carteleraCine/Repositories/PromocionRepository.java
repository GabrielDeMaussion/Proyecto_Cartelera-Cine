package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.PromocionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromocionRepository extends JpaRepository<PromocionEntity, Long> {
}
