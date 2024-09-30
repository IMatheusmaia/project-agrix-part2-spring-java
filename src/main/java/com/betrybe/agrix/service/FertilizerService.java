package com.betrybe.agrix.service;

import com.betrybe.agrix.entity.FertilizerEntity;
import com.betrybe.agrix.repository.FertilizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Fertilizer service.
 */
@Service
public class FertilizerService {

  private final FertilizerRepository fertilizerRepository;

  @Autowired
  public FertilizerService(FertilizerRepository fertilizerRepository) {
    this.fertilizerRepository = fertilizerRepository;
  }

  public FertilizerEntity create(FertilizerEntity fertilizer) {
    return fertilizerRepository.save(fertilizer);
  }
}
