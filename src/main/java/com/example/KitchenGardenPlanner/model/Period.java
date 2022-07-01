package com.example.KitchenGardenPlanner.model;

import com.example.KitchenGardenPlanner.model.enums.PlantEventTypes;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Period {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    PlantEventTypes type;
    int startMonth;
    int endMonth;
}
