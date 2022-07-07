package com.example.KitchenGardenPlanner.services;

import com.example.KitchenGardenPlanner.model.Period;
import com.example.KitchenGardenPlanner.model.enums.PlantEventTypes;
import com.example.KitchenGardenPlanner.repository.PeriodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PeriodService {
    final PeriodRepository periodRepository;

//    Iterable<Period> findByTypeAndMonth(PlantEventTypes type, int month) {
//        return periodRepository.findByTypeAndStartMonthIsLessThanEqualAndAndEndMonthGreaterThanEqual(type, month, month);
//    }
}
