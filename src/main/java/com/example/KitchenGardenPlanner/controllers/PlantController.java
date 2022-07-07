package com.example.KitchenGardenPlanner.controllers;

import com.example.KitchenGardenPlanner.model.Plant;
import com.example.KitchenGardenPlanner.services.PlantService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.Optional;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class PlantController {
    final PlantService plantService;

    @PostMapping("/api/plant")
    Plant save(@Valid @RequestBody Plant plant) {
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
    Plant getPlant(@PathVariable long id) {
        Optional<Plant> plantOptional = plantService.findPlantById(id);
        return plantOptional.orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "No plant found with id: " + id)
        );
    }

    @GetMapping("/api/plant/harvest/{monthNumber}")
    Iterable<Plant> findHarvestablePlants(@PathVariable int monthNumber) {
        return this.plantService.findHarvestablePlants(monthNumber);
    }
}
