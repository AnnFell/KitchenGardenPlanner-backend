package com.example.KitchenGardenPlanner.controllers;

import com.example.KitchenGardenPlanner.model.Plant;
import com.example.KitchenGardenPlanner.model.Stock;
import com.example.KitchenGardenPlanner.services.PlantService;
import com.example.KitchenGardenPlanner.services.StockService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class StockController {
    final StockService stockService;
    final PlantService plantService;

    @GetMapping("/api/stock")
    Iterable<Stock> findAllStock() {
        return stockService.findAllStock();
    }

    @PostMapping("/api/stock")
    Stock saveStock(@Valid @RequestBody Stock stock) {
        return stockService.saveStock(stock);
    }

    @DeleteMapping("/api/stock/{id}")
    void delete(@PathVariable long id) {
        stockService.deleteStock(id);
    }

    @GetMapping("/api/plant/harvest/{monthNumber}")
    Iterable<Plant> findHarvestablePlants(@PathVariable int monthNumber) {
        return this.stockService.findHarvestablePlants(monthNumber);
    }
}
