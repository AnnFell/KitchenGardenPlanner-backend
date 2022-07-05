package com.example.KitchenGardenPlanner.services;

import com.example.KitchenGardenPlanner.model.Plant;
import com.example.KitchenGardenPlanner.model.Stock;
import org.springframework.data.repository.CrudRepository;

public interface PlantService extends CrudRepository<Plant, Long> {
    Iterable<Plant> findByTypeId(Long id);
}
