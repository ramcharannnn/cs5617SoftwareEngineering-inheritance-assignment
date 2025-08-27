package com.vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for Vehicle and its subclasses.
 */
final class VehicleTest {

    /**
     * Tests that the base Vehicle class has the correct default start message.
     */
    @Test
    void baseVehicleHasDefaultStartMessage() {
        final Vehicle v = new Vehicle("GenericVehicle");
        assertEquals("The vehicle engine starts.", v.start());
    }

    /**
     * Tests the Car's specific start message and its unique honk method.
     */
    @Test
    void carStartMessageIsCorrect() {
        final Car car = new Car("CityCar");
        assertEquals("CityCar: ignition started", car.start());
        assertEquals("CityCar: Beep beep!", car.honk());
    }

    /**
     * Tests the Bike's specific start message and its unique performWheelie method.
     */
    @Test
    void bikeStartMessageIsCorrect() {
        final Bike bike = new Bike("SpeedBike");
        assertEquals("SpeedBike: kick start engaged", bike.start());
        assertEquals("SpeedBike: The bike pops a wheelie!", bike.performWheelie());
    }

    /**
     * Tests the Truck's specific start message.
     */
    @Test
    void truckStartMessageIsCorrect() {
        final Truck truck = new Truck("CargoTruck");
        assertEquals("CargoTruck: diesel engine roaring", truck.start());
    }

    /**
     * Tests the Cycle's specific start message.
     */
    @Test
    void cycleStartMessageIsCorrect() {
        final Cycle cycle = new Cycle("MyCycle");
        assertEquals("MyCycle: pedal and go", cycle.start());
    }

    /**
     * Tests the Garage's ability to start various vehicle types, demonstrating polymorphism.
     */
    @Test
    void garagePolymorphismTest() {
        final List<Vehicle> vehicles = List.of(
                new Car("Car1"),
                new Bike("Moto1"),
                new Truck("Truck1"),
                new Cycle("Cycle1"));

        final String result = Garage.startAll(vehicles);
        final String[] lines = result.split("\n");

        assertEquals(4, lines.length);
        assertTrue(lines[0].contains("Car1: ignition started"));
        assertTrue(lines[1].contains("Moto1: kick start engaged"));
        assertTrue(lines[2].contains("Truck1: diesel engine roaring"));
        assertTrue(lines[3].contains("Cycle1: pedal and go"));
    }
}