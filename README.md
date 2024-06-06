## Switch Branches to Learn Different Patterns

To explore different design patterns, switch branches in this repository:

- `builder-pattern`: Example of the Builder pattern
- `factory-pattern`: Example of the Factory pattern
- `abstract-factory-pattern`: Example of the Abstract Factory pattern
- `singleton-pattern`: Example of the Singleton pattern 

# Singleton Pattern Example Repository

This repository contains an example implementation of the Singleton design pattern in Kotlin. The code demonstrates how to create a single instance of the `WeldingArmPoolSingleton` class using the Singleton pattern.

## Usage

1. Navigate to the `src` directory.
2. Open the `Main.kt` file to see a demonstration of the Singleton pattern with the `WeldingArmPoolSingleton` class.
3. Explore the `WeldingArmPoolSingleton.kt` file to understand the implementation details of the Singleton pattern.

## Classes

### Main.kt

This file contains the main function demonstrating the usage of the Singleton pattern with the `WeldingArmPoolSingleton` class.

### WeldingArmPoolSingleton.kt

This file defines the `WeldingArmPoolSingleton` class, which is a singleton responsible for managing a pool of welding arms. It ensures that only one instance of the `WeldingArmPoolSingleton` class exists throughout the application.

## How to Run

To run the code:

1. Ensure you have Kotlin installed on your machine.
2. Navigate to the `src` directory.
3. Run the `Main.kt` file.

## Singleton Pattern

“The Object Pool pattern can be effectively combined with the Singleton pattern. The Singleton pattern is controversial and often considered an antipattern because it cannot be extended, and it promotes tight coupling.”

Excerpt From
Real-World Implementation of C# Design Patterns
Bruce M. Van Horn II
This material may be protected by copyright.

In this example, the `WeldingArmPoolSingleton` class serves as a singleton responsible for managing a pool of welding arms. The `instanceSingleton` property provides access to the single instance of the `WeldingArmPoolSingleton` class, ensuring that only one instance exists throughout the application.

## Contribution

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.
