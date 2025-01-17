package com.betrybe.agrix.repository;

import com.betrybe.agrix.entity.CropEntity;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Crop repository.
 */
@Repository
public interface CropRepository extends JpaRepository<CropEntity, Long> {
  List<CropEntity> findAllByHarvestDateBetween(LocalDate start, LocalDate end);
}
