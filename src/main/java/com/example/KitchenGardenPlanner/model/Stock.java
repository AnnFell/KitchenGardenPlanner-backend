package com.example.KitchenGardenPlanner.model;

import com.example.KitchenGardenPlanner.model.enums.LightPreference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Year;
import java.util.List;

@Getter
@Setter
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String name;
    String latinName;
    String description;
    String brand;
    Year bestBefore;
    boolean isPerennial;

    LightPreference lightPreference;

    @Column(columnDefinition = "boolean default true")
    boolean available;

    @OneToMany(cascade = CascadeType.ALL)
    List<Period> periods;

    int spaceBetweenRows;
    int spaceBetweenPlants;
}
