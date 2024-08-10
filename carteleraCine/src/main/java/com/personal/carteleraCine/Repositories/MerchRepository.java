package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Entities.MerchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchRepository extends JpaRepository<MerchEntity, Long> {
}
