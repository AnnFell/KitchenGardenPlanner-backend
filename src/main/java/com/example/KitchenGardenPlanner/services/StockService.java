package com.example.KitchenGardenPlanner.services;

import com.example.KitchenGardenPlanner.model.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockService extends CrudRepository<Stock, Long> {
}
