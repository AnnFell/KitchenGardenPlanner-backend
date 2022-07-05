package com.example.KitchenGardenPlanner.controllers;

import com.example.KitchenGardenPlanner.model.Plant;
import com.example.KitchenGardenPlanner.services.PlantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class PlantController {
    final PlantService plantService;

    @PostMapping("/plant")
    Plant save(@RequestBody Plant plant) {
        return plantService.save(plant);
    }

    @GetMapping("/plant")
    Iterable<Plant> findAll() {
        return this.plantService.findAll();
    }

    @DeleteMapping("/plant/{id}")
    void delete(@PathVariable long id) {
        plantService.deleteById(id);
    }
}
