package com.betrybe.agrix.controller;

import com.betrybe.agrix.controller.dto.FertilizerDtoCreated;
import com.betrybe.agrix.controller.dto.FertilizerDtoResponse;
import com.betrybe.agrix.entity.FertilizerEntity;
import com.betrybe.agrix.service.FertilizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Fertilizer controller.
 */
@RestController
@RequestMapping("/fertilizers")
public class FertilizerController {

  private final FertilizerService fertilizerService;

  /**
   * Instantiates a new Fertilizer controller.
   *
   * @param fertilizerService the fertilizer service
   */
  @Autowired
  public FertilizerController(FertilizerService fertilizerService) {
    this.fertilizerService = fertilizerService;
  }

  /**
   * Create response entity.
   *
   * @param fertilizerDtoCreated the fertilizer dto created
   * @return the response entity
   */
  @PostMapping
  public ResponseEntity<FertilizerDtoResponse> create(
          @RequestBody FertilizerDtoCreated fertilizerDtoCreated) {
    FertilizerEntity newFertilizer = fertilizerService.create(
            FertilizerDtoCreated.toEntity(fertilizerDtoCreated));

    return ResponseEntity.status(HttpStatus.CREATED).body(
            FertilizerDtoResponse.fromEntity(newFertilizer)
    );
  }
}
