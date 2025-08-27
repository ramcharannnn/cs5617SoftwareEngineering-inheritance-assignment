package com.vehicle;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A utility class to manage a collection of vehicles.
 */
public final class Garage {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private Garage() {
    }

    /**
     * Starts all vehicles in a list and returns a consolidated status report.
     *
     * @param vehicles A list of vehicles to start.
     * @return A single string with each vehicle's start status on a new line.
     */
    public static String startAll(final List<Vehicle> vehicles) {
        return vehicles.stream()
                .map(Vehicle::start)
                .collect(Collectors.joining("\n"));
    }
}