package com.example.KitchenGardenPlanner.model;

import com.example.KitchenGardenPlanner.model.enums.PlantEventTypes;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Period {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @NotNull
    PlantEventTypes type;

    @NotNull
    int startMonth;

    @NotNull
    int endMonth;
}
