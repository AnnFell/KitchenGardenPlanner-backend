package com.example.KitchenGardenPlanner.repository;

import com.example.KitchenGardenPlanner.model.Plant;
import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant, Long> {
    Iterable<Plant> findByTypeId(Long id);
}
