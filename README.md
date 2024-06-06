## Switch Branches to Learn Different Patterns

To explore different design patterns, switch branches in this repository:

- `builder-pattern`: Example of the Builder pattern
- `factory-pattern`: Example of the Factory pattern
- `abstract-factory-pattern`: Example of the Abstract Factory pattern
- `singleton-pattern`: Example of the Singleton pattern 

# Builder Pattern Example Repository

This repository contains an example implementation of the Builder design pattern in Kotlin. The code demonstrates how to construct complex objects using the Builder pattern with a `RoadBikeBuilder`.

## Usage

1. Navigate to the `src` directory.
2. Open the `Main.kt` file to see a demonstration of the Builder pattern with the `RoadBikeBuilder` class.
3. Explore the `RoadBikeBuilder.kt` file to understand the implementation details of the Builder pattern.

## Classes

### Main.kt

This file contains the main function demonstrating the usage of the Builder pattern with the `RoadBikeBuilder` class.

### RoadBikeBuilder.kt

This file defines the `RoadBikeBuilder` class, which is responsible for constructing road bikes using the Builder pattern. It allows users to specify the components and features of the road bike step by step, resulting in a customized and properly configured road bike object.

## How to Run

To run the code:

1. Ensure you have Kotlin installed on your machine.
2. Navigate to the `src` directory.
3. Run the `Main.kt` file.

## Builder Pattern

“The Builder pattern is used when you need to make objects using a complex set of steps. Using it is similar to the Abstract Factory pattern, but your builder classes are defined by an interface. Each method in the builder represents a step of the build process. It might be tempting to put a single method in each builder class to call the steps in order. However, this is usually delegated to a Director class. The builder houses the methods to build the object, but the Director class contains the logic behind the order in which those methods are called.”

Excerpt From
Real-World Implementation of C# Design Patterns
Bruce M. Van Horn II
This material may be protected by copyright.

In this example, the `RoadBikeBuilder` class serves as a builder for constructing road bikes. It allows users to specify the components and features of the road bike, such as frame type, wheel size, and gear set, independently of the construction process, resulting in a flexible and customizable object creation process.

## Contribution

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.
