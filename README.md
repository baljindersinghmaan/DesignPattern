# Factory Pattern Example Repository

This repository contains example implementations of the Factory design pattern in Kotlin. The code demonstrates how to create objects using factory methods with different creators.

## Usage

1. Navigate to the `src` directory.
2. Open the `Main.kt` file to see a demonstration of the Factory pattern with `DallasCreator` and `AlpineCreator` classes.
3. Explore the `DallasCreator.kt` and `AlpineCreator.kt` files to understand the implementation details of the Factory pattern.

## Classes

### Main.kt

This file contains the main function demonstrating the usage of the Factory pattern with `DallasCreator` and `AlpineCreator` classes.

### DallasCreator.kt

This file defines the `DallasCreator` class, which is a factory creator for creating objects related to Dallas.

### AlpineCreator.kt

This file defines the `AlpineCreator` class, which is a factory creator for creating objects related to the Alpine region.

## How to Run

To run the code:

1. Ensure you have Kotlin installed on your machine.
2. Navigate to the `src` directory.
3. Run the `Main.kt` file.

## Factory Pattern

“The Factory Method pattern is what most people think of when they hear “factory pattern.” Using it entails abstracting creation logic into a factory class called a creator. The creator object is defined by an interface to maximize flexibility. We also create an interface for the objects the factory is producing. We call this the product. Each factory creator class is responsible for a subset of all the products in your program.”

Excerpt From
Real-World Implementation of C# Design Patterns
Bruce M. Van Horn II
This material may be protected by copyright.

In this example, the `DallasCreator` and `AlpineCreator` classes serve as factory creators for creating objects related to different regions (Dallas and Alpine). Each creator encapsulates the logic for creating objects specific to its region, providing a uniform interface for object creation.

## Contribution

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.
