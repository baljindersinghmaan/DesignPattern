## Switch Branches to Learn Different Patterns

To explore different design patterns, switch branches in this repository:

- `builder-pattern`: Example of the Builder pattern
- `factory-pattern`: Example of the Factory pattern
- `abstract-factory-pattern`: Example of the Abstract Factory pattern
- `singleton-pattern`: Example of the Singleton pattern 


# Simple Factory Example Repository

This repository contains an example implementation of the Simple Factory design pattern in Kotlin. The code demonstrates how to create bicycles using the Simple Factory pattern.

## Simple Factory Pattern

The Simple Factory pattern is a creational design pattern that provides a simple interface for creating objects without exposing the object creation logic to the client. It encapsulates the object creation process and allows the client to use a single method to create different types of objects.

In this example, the `SimpleBicycleFactory` class serves as a factory for creating bicycles. The client can request a bicycle of a specific type (e.g., "mountain" or "road") using the factory's `createBicycle` method, without needing to know the details of how each type of bicycle is created.

## Usage

1. Navigate to the `src` directory.
2. Open the `Main.kt` file to see a demonstration of the `SimpleBicycleFactory` class.
3. Explore the `SimpleBicycleFactory.kt` file to understand the implementation details of the Simple Factory pattern.

## Classes

### Main.kt

This file contains the main function demonstrating the usage of the `SimpleBicycleFactory` class.

### SimpleBicycleFactory.kt

This file defines the `SimpleBicycleFactory` class, which implements the Simple Factory pattern. It provides a method to create different types of bicycles based on the user's input.

## How to Run

To run the code:

1. Ensure you have Kotlin installed on your machine.
2. Navigate to the `src` directory.
3. Run the `Main.kt` file.


## Contribution

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to create a pull request.
