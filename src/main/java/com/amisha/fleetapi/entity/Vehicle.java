package com.amisha.fleetapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "vehicles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "VIN cannot be empty")
    @Column(unique = true, nullable = false)
    private String vin;

    @NotBlank(message = "Model cannot be empty")
    @Column(nullable = false)
    private String model;

    private String firmwareVersion;

    @NotNull(message = "Last service date is required")
    private LocalDate lastServiceDate;
}