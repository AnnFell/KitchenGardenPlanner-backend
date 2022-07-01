package com.example.KitchenGardenPlanner.services;

import com.example.KitchenGardenPlanner.model.Period;
import org.springframework.data.repository.CrudRepository;

public interface PeriodService extends CrudRepository<Period, Long> {
}
