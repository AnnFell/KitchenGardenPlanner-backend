package com.example.KitchenGardenPlanner.services;

import com.example.KitchenGardenPlanner.model.Plant;
import com.example.KitchenGardenPlanner.repository.PlantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class PlantService {
    final PlantRepository plantRepository;

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
}