package com.vehicle;

/**
 * Represents a Cycle, a specialized type of Vehicle that is human-powered.
 */
public final class Cycle extends Vehicle {

    /**
     * Constructs a new Cycle.
     *
     * @param name The name for this cycle.
     */
    public Cycle(final String name) {
        super(name);
    }

    /**
     * Starts the cycle.
     *
     * @return A string describing the cycle starting.
     */
    @Override
    public String start() {
        return getName() + ": pedal and go";
    }
}