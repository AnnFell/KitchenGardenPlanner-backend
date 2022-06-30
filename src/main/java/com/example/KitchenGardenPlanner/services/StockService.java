package com.example.KitchenGardenPlanner.services;

import com.example.KitchenGardenPlanner.model.StockItem;
import org.springframework.data.repository.CrudRepository;

public interface StockService extends CrudRepository<StockItem, Long> {
}
