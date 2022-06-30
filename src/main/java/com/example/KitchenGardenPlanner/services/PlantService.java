package com.example.KitchenGardenPlanner.services;

import com.example.KitchenGardenPlanner.model.Plant;
import org.springframework.data.repository.CrudRepository;

public interface PlantService extends CrudRepository<Plant, Long> {
}
