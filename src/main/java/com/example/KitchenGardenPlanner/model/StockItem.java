package com.example.KitchenGardenPlanner.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class StockItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String description;

    // 1 Stock

    // perennial?

    // periodes:
    // Zaaiperiode onder glas
    // Zaaiperiode volle grond
    // Uitplanten periode
    // Bloeiperiode
    // Oogstperiode

    // plantafstand x * y
    // zaaidiepte
    // houdbaarheid zakje
    // standplaats: zon/halfschaduw/schaduw
    // merknaam en hoeveelheid

}
