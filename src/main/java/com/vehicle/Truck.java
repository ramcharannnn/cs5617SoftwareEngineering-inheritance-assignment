package com.vehicle;

/**
 * Represents a Truck, a specialized type of Vehicle.
 */
public final class Truck extends Vehicle {

    /**
     * Constructs a new Truck.
     *
     * @param name The name for this truck.
     */
    public Truck(final String name) {
        super(name);
    }

    /**
     * Starts the truck's engine.
     *
     * @return A string describing the truck starting.
     */
    @Override
    public String start() {
        return getName() + ": diesel engine roaring";
    }
}