package com.example.KitchenGardenPlanner.services;

import com.example.KitchenGardenPlanner.repository.PeriodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PeriodService {
    final PeriodRepository periodRepository;
}
