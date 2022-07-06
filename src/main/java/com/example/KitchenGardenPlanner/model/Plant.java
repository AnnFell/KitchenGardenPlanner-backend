package com.example.KitchenGardenPlanner.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @ManyToOne
    Stock type;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate date;

    @NotNull
    @Column(columnDefinition = "varchar(255) default 'No location specified'")
    String location;

    @NotNull
    @Column(columnDefinition = "boolean default false")
    boolean harvested;
}
