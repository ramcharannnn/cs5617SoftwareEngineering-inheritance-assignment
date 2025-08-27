package com.vehicle;

/**
 * Represents a generic base vehicle.
 * This class provides a common structure for all vehicle types.
 */
public class Vehicle {

    /**
     * The name of the vehicle.
     */
    private String name;

    /**
     * Constructs a new Vehicle with a given name.
     *
     * @param vehicleName The name for this vehicle.
     */
    public Vehicle(final String vehicleName) {
        this.name = vehicleName;
    }

    /**
     * Gets the name of the vehicle.
     *
     * @return The vehicle's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the vehicle.
     *
     * @param newName The new name for this vehicle.
     */
    public void setName(final String newName) {
        this.name = newName;
    }

    /**
     * Starts the vehicle's engine.
     *
     * @return A string indicating the engine start action.
     */
    public String start() {
        return "The vehicle engine starts.";
    }
}