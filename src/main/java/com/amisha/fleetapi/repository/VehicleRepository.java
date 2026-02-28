package com.amisha.fleetapi.repository;

import com.amisha.fleetapi.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}