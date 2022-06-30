package com.example.KitchenGardenPlanner.controllers;

import com.example.KitchenGardenPlanner.model.StockItem;
import com.example.KitchenGardenPlanner.services.StockService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class StockController {
    final
    StockService stockService;

    // in plaats van autowired service. En met lombok niet meer nodig
//    public StockController(StockService stockService) {
//        this.stockService = stockService;
//    }

    @GetMapping("/stock")
    Iterable<StockItem> getAllStockItems() {
        return stockService.findAll();
    }

    @PostMapping("/stock")
    StockItem saveStockItem(@RequestBody StockItem stockItem) {
        // TODO error handling
        return stockService.save(stockItem);
    }

}
