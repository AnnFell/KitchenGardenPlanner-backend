package com.example.KitchenGardenPlanner.repository;

import com.example.KitchenGardenPlanner.model.Period;
import com.example.KitchenGardenPlanner.model.enums.PlantEventTypes;
import org.springframework.data.repository.CrudRepository;

public interface PeriodRepository extends CrudRepository<Period, Long> {
}
