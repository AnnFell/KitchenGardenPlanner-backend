package com.example.KitchenGardenPlanner.services;

import com.example.KitchenGardenPlanner.model.Period;
import com.example.KitchenGardenPlanner.model.Plant;
import com.example.KitchenGardenPlanner.model.Stock;
import com.example.KitchenGardenPlanner.model.enums.PlantEventTypes;
import com.example.KitchenGardenPlanner.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class StockService {
    final StockRepository stockRepository;
    final PlantService plantService;

    public Iterable<Stock> findAllStock() {
        return stockRepository.findAll();
    }

    public Stock saveStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public void deleteStock(Long id) {
        plantService.deletePlantsByTypeId(id);
        stockRepository.deleteById(id);
    }

    public Iterable<Plant> findHarvestablePlants(int monthNumber) {
        // Get all stock
        Iterable<Stock> allStock = findAllStock();
        // From each stock, find periods. Keep stock if:
        // period type is harvest
        // month is in range of period
        List<Long> harvestableStockIds = new ArrayList<>();
        for (Stock stock : allStock) {
            Period[] periods = stock.getPeriods().toArray(new Period[0]);
            for (Period period : periods) {
                if (period.getType().equals(PlantEventTypes.HARVEST) &&
                        period.getStartMonth() <= monthNumber &&
                        period.getEndMonth() >= monthNumber) {
                    harvestableStockIds.add(stock.getId());
                }
            }
        }
        // Get all plants with stock type
        List<Plant> harvestablePlants = new ArrayList<>();
        for (long stockId : harvestableStockIds) {
            Iterable<Plant> plants = plantService.findPlantByTypeId(stockId);
            for (Plant plant : plants) {
                harvestablePlants.add(plant);
            }
        }
        // return collection of plants
        return harvestablePlants;
    }
}