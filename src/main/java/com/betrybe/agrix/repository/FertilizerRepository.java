package com.betrybe.agrix.repository;

import com.betrybe.agrix.entity.FertilizerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Fertilizer repository.
 */
@Repository
public interface FertilizerRepository extends JpaRepository<FertilizerEntity, Long> {
}
