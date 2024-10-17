# Example of Using Builder Pattern for Cars

This repository contains a simple example of the Builder design pattern in Java, specifically tailored for creating Car objects. The example also includes validation to ensure that the model and brand of the car match, using custom exceptions.

## Overview

The program consists of the following components:
1. `Car` class: Represents a car with fields like brand, model, kilometers traveled, and engine capacity.
2. `CarBuilder` class: A static inner class within `Car` used to build `Car` objects.
3. `CarModel` enum: Defines various car models, each associated with a specific brand.
4. `CarBrand` enum: Defines various car brands.
5. `InvalidCarModelException` class: A custom exception thrown when an invalid combination of brand and model is detected.
