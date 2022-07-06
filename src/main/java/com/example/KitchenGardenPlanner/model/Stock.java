package com.example.KitchenGardenPlanner.model;

import com.example.KitchenGardenPlanner.model.enums.LightPreference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @NotBlank
    @NotNull
    String name;

    @NotNull
    @Column(columnDefinition = "varchar(255) default ''")
    String latinName;

    @NotNull
    @Column(columnDefinition = "varchar(255) default ''")
    String description;

    @NotNull
    @Column(columnDefinition = "varchar(255) default ''")
    String brand;

    @NotNull
    @Column(columnDefinition = "int(11) default '0'")
    LightPreference lightPreference;

    @NotNull
    @Column(columnDefinition = "boolean default true")
    boolean available;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    List<Period> periods;

    @NotNull
    @Column(columnDefinition = "int(11) default '0'")
    int spaceBetweenRows;

    @NotNull
    @Column(columnDefinition = "int(11) default '0'")
    int spaceBetweenPlants;
}
