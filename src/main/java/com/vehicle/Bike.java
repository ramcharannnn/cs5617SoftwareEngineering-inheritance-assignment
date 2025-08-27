package com.vehicle;

/**
 * Represents a Bike, a specialized type of Vehicle.
 */
public final class Bike extends Vehicle {

    /**
     * Constructs a new Bike.
     *
     * @param name The name for this bike.
     */
    public Bike(final String name) {
        super(name);
    }

    /**
     * Starts the bike's engine.
     *
     * @return A string describing the bike starting.
     */
    @Override
    public String start() {
        return getName() + ": kick start engaged";
    }

    /**
     * Performs a wheelie.
     *
     * @return A string describing the action.
     */
    public String performWheelie() {
        return getName() + ": The bike pops a wheelie!";
    }
}