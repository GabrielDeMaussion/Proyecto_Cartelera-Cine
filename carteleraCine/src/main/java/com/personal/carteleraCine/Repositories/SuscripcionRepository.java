package com.personal.carteleraCine.Repositories;

import com.personal.carteleraCine.Dtos.Get.GetSuscripcionDto;
import com.personal.carteleraCine.Entities.SuscripcionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuscripcionRepository extends JpaRepository<SuscripcionEntity, Long> {
}
