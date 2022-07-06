package com.example.KitchenGardenPlanner.controllers;

import com.example.KitchenGardenPlanner.model.Plant;
import com.example.KitchenGardenPlanner.services.PlantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class PlantController {
    final PlantService plantService;

    @PostMapping("/api/plant")
    Plant save(@RequestBody Plant plant) {
        return plantService.savePlant(plant);
    }

    @GetMapping("/api/plant")
    Iterable<Plant> findAll() {
        return this.plantService.findAllPlants();
    }

    @DeleteMapping("/api/plant/{id}")
    void delete(@PathVariable long id) {
        plantService.deletePlantById(id);
    }

    @GetMapping("/api/plant/{id}")
    Optional<Plant> getPlant(@PathVariable long id) {
        return this.plantService.findPlantById(id);
    }
}
