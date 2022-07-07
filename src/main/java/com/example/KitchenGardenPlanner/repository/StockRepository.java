package com.example.KitchenGardenPlanner.repository;

import com.example.KitchenGardenPlanner.model.Period;
import com.example.KitchenGardenPlanner.model.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock, Long> {
//    Stock findByPeriodsContaining(Period period);
}
