package com.amisha.fleetapi;

import com.amisha.fleetapi.entity.Vehicle;
import com.amisha.fleetapi.repository.VehicleRepository;
import com.amisha.fleetapi.service.VehicleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class VehicleServiceTest {

    @Mock
    private VehicleRepository vehicleRepository;

    @InjectMocks
    private VehicleService vehicleService;

    private Vehicle vehicle;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        vehicle = Vehicle.builder()
                .id(1L)
                .vin("VIN12345")
                .model("Tesla Model 3")
                .firmwareVersion("v1.0.0")
                .lastServiceDate(LocalDate.now())
                .build();
    }

    @Test
    void testCreateVehicle() {
        when(vehicleRepository.save(vehicle)).thenReturn(vehicle);

        Vehicle savedVehicle = vehicleService.createVehicle(vehicle);

        assertNotNull(savedVehicle);
        assertEquals("VIN12345", savedVehicle.getVin());
        verify(vehicleRepository, times(1)).save(vehicle);
    }

    @Test
    void testGetVehicleById() {
        when(vehicleRepository.findById(1L)).thenReturn(Optional.of(vehicle));

        Vehicle foundVehicle = vehicleService.getVehicleById(1L);

        assertEquals("Tesla Model 3", foundVehicle.getModel());
    }

    @Test
    void testGetVehicleById_NotFound() {
        when(vehicleRepository.findById(1L)).thenReturn(Optional.empty());

        RuntimeException exception = assertThrows(RuntimeException.class, () ->
                vehicleService.getVehicleById(1L)
        );

        assertEquals("Vehicle not found with id: 1", exception.getMessage());
    }
}