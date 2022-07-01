package com.example.KitchenGardenPlanner.controllers;

import com.example.KitchenGardenPlanner.model.Stock;
import com.example.KitchenGardenPlanner.services.StockService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class StockController {
    final StockService stockService;

    @GetMapping("/stock")
    Iterable<Stock> getAllStock() {
        return stockService.findAll();
    }

    @PostMapping("/stock")
    Stock saveStock(@RequestBody Stock stock) {
        return stockService.save(stock);
    }

    @DeleteMapping("/stock/{id}")
    void delete(@PathVariable long id) {
        stockService.deleteById(id);
    }

}
