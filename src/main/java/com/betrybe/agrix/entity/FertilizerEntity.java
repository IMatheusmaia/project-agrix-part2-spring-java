package com.betrybe.agrix.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 * The type Fertilizers entity.
 */
@Entity
@Table(name = "fertilizers")
public class FertilizerEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String brand;
  private String composition;

  @ManyToMany
  @JoinTable(
      name = "crop_fertilizer",
      joinColumns = @JoinColumn(name = "fertilizer_id"),
      inverseJoinColumns = @JoinColumn(name = "crop_id")
  )
  private List<CropEntity> crops;

  public FertilizerEntity() {
  }

  /**
   * Instantiates a new Fertilizers entity.
   *
   * @param id          the id
   * @param name        the name
   * @param brand       the brand
   * @param composition the composition
   */
  public FertilizerEntity(Long id, String name, String brand, String composition) {
    this.id = id;
    this.name = name;
    this.brand = brand;
    this.composition = composition;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getComposition() {
    return composition;
  }

  public void setComposition(String composition) {
    this.composition = composition;
  }

  public List<CropEntity> getCrops() {
    return crops;
  }

  public void setCrops(List<CropEntity> crops) {
    this.crops = crops;
  }
}
