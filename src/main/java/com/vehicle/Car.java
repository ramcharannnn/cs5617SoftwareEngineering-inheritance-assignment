package com.vehicle;

/**
 * Represents a Car, a specialized type of Vehicle.
 */
public final class Car extends Vehicle {

    /**
     * Constructs a new Car.
     *
     * @param name The name for this car.
     */
    public Car(final String name) {
        super(name);
    }

    /**
     * Starts the car's engine.
     *
     * @return A string describing the car starting.
     */
    @Override
    public String start() {
        return getName() + ": ignition started";
    }

    /**
     * Produces the sound of a car horn.
     *
     * @return A string representing the horn sound.
     */
    public String honk() {
        return getName() + ": Beep beep!";
    }
}