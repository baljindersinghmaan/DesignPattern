## Switch Branches to Learn Different Patterns

To explore different design patterns, switch branches in this repository:

- `builder-pattern`: Example of the Builder pattern
- `factory-pattern`: Example of the Factory pattern
- `abstract-factory-pattern`: Example of the Abstract Factory pattern
- `singleton-pattern`: Example of the Singleton pattern 

# Abstract Factory Pattern Example Repository

This repository contains an example implementation of the Abstract Factory design pattern in Kotlin. The code demonstrates how to create families of related objects using the Abstract Factory pattern with a `RoadBicycleFactory`.

## Usage

1. Navigate to the `src` directory.
2. Open the `Main.kt` file to see a demonstration of the Abstract Factory pattern with the `RoadBicycleFactory` class.
3. Explore the `RoadBicycleFactory.kt` file to understand the implementation details of the Abstract Factory pattern.

## Classes

### Main.kt

This file contains the main function demonstrating the usage of the Abstract Factory pattern with the `RoadBicycleFactory` class.

### RoadBicycleFactory.kt

This file defines the `RoadBicycleFactory` class, which is an abstract factory for creating families of related objects, specifically related to road bicycles.

## How to Run

To run the code:

1. Ensure you have Kotlin installed on your machine.
2. Navigate to the `src` directory.
3. Run the `Main.kt` file.

## Abstract Factory Pattern

“The Abstract Factory pattern involves creating families of objects that organically go together. Using it entails creating an abstract definition for multiple creator classes. Each creator is responsible for a concrete object.”

Excerpt From
Real-World Implementation of C# Design Patterns
Bruce M. Van Horn II
This material may be protected by copyright.

In this example, the `RoadBicycleFactory` class serves as an abstract factory for creating families of related objects, such as road bicycles. Subclasses of `RoadBicycleFactory` can provide their own implementations for creating different types of road bicycles, such as racing bicycles or touring bicycles, while maintaining a consistent interface for object creation.

## Contribution

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.
