package com.example.KitchenGardenPlanner.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    Stock type;

    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate date;

    String location; // TODO optional
    boolean harvested; // TODO default false

}
