# CS5617 Assignment: Inheritance

**Name:** Ram Charan (112201045) 

This project demonstrates inheritance in Java through a vehicle hierarchy.

## Project Structure

- `Vehicle` - Base class with common properties and behaviors
- `Car` - Extends Vehicle with car-specific properties
- `Bike` - Extends Vehicle with Bike-specific properties
- `Truck` - Extends Vehicle with truck-specific properties
- `Cycle` - Extends Vehicle with Cycle-specific properties

## Design Principles

1. **Inheritance**: All vehicle types inherit from the base Vehicle class
2. **Polymorphism**: Each vehicle type overrides the start() method with its own implementation
3. **Encapsulation**: All fields are private with public getters
4. **Code Reuse**: Common functionality is implemented in the base class

## Prerequisites

To build and test this project, you will need:
* Java Development Kit (JDK 11 or newer)
* Apache Maven 

## Getting Started

**1. Clone the repository:**
```bash
# Replace with your actual repository URL
git clone 

2. Navigate to the project directory:
cd your-repository-name

Verification Commands
This project is configured to be built and verified using Maven.  Run the following commands from the project root to ensure correctness.
1.  **Compile Code**
    ```bash
    mvn clean compile
    ```
2.  **Check Style**
    ```bash
    mvn checkstyle:check
    ```
3.  **Run Tests**
    ```bash
    mvn test
    ```
