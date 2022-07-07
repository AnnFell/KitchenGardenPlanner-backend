package com.example.KitchenGardenPlanner.services;

import com.example.KitchenGardenPlanner.model.Period;
import com.example.KitchenGardenPlanner.model.Plant;
import com.example.KitchenGardenPlanner.model.Stock;
import com.example.KitchenGardenPlanner.model.enums.PlantEventTypes;
import com.example.KitchenGardenPlanner.repository.PlantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PlantService {
    final PlantRepository plantRepository;
    final PeriodService periodService;
    final StockService stockService;

    public Plant savePlant(Plant plant) {
        return plantRepository.save(plant);
    }

    public Iterable<Plant> findAllPlants() {
        return plantRepository.findAll();
    }

    public void deletePlantById(long id) {
        plantRepository.deleteById(id);
    }

    public void deletePlantsByTypeId(long id) {
        Iterable<Plant> plants = findPlantByTypeId(id);
        plantRepository.deleteAll(plants);
    }

    public Optional<Plant> findPlantById(long id) {
        return plantRepository.findById(id);
    }

    public Iterable<Plant> findPlantByTypeId(long id) {
        return plantRepository.findByTypeId(id);
    }

    public Iterable<Plant> findHarvestablePlants(int monthNumber) {
        // find periods matching the month number
//        Iterable<Period> periods = periodService.findByTypeAndMonth(PlantEventTypes.HARVEST, monthNumber);
        // find the stock items that these periods belong to
//        List<Stock> stocks = new ArrayList<>();
//        for (Period period : periods) {
//            stocks.add(stockService.findByPeriodsContaining(period));
//        }
        // find the plants with that stock type id
        return plantRepository.findAll();
    }
}