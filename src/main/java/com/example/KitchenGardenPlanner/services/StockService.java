package com.example.KitchenGardenPlanner.services;

import com.example.KitchenGardenPlanner.model.Stock;
import com.example.KitchenGardenPlanner.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StockService {
    final StockRepository stockRepository;
    final PlantService plantService;

    public Iterable<Stock> findAllStock() {
        return this.stockRepository.findAll();
    }

    public Stock saveStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public void deleteStock(Long id) {
        plantService.deletePlantsByTypeId(id);
        stockRepository.deleteById(id);
    }
}