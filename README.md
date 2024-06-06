## Switch Branches to Learn Different Patterns

To explore different design patterns, switch branches in this repository:

- `builder-pattern`: Example of the Builder pattern
- `factory-pattern`: Example of the Factory pattern
- `abstract-factory-pattern`: Example of the Abstract Factory pattern
- `singleton-pattern`: Example of the Singleton pattern 

# Object Pool Example Repository
Imagine you have a limited resource that takes time to create, like a database connection, threads, or complex objects. Creating and destroying these resources frequently can be inefficient.

An object pool is like a container that holds a pre-initialized set of these resources. Instead of creating new resources every time you need one, you borrow one from the pool. After you're done using it, you return it to the pool for reuse by someone else.

Think of it like having a collection of ready-to-use items at your disposal. When you need one, you grab it from the collection. When you're done, you put it back in the collection for someone else to use.

This approach saves time and resources because creating and destroying objects is expensive, but reusing them from a pool is much faster and more efficient.
This repository contains an example implementation of the Object Pool design pattern in Kotlin. The code demonstrates how to manage a pool of welding arms effectively using the Object Pool pattern.

## Usage

1. Navigate to the `src` directory.
2. Open the `Main.kt` file to see a demonstration of the `WeldingArmPool` class.
3. Explore the `WeldingArmPool.kt` file to understand the implementation details of the Object Pool pattern.

## Classes

### Main.kt

This file contains the main function demonstrating the usage of the `WeldingArmPool` class. It creates a pool of welding arms, borrows arms from the pool, and returns them after use.

### WeldingArmPool.kt

This file defines the `WeldingArmPool` class, which implements the Object Pool pattern. It manages a pool of welding arms, allowing users to borrow arms from the pool and return them after use.

## How to Run

To run the code:

1. Ensure you have Kotlin installed on your machine.
2. Navigate to the `src` directory.
3. Run the `Main.kt` file.

## Contribution

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.
