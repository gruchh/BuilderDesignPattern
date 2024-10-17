package pl.wozrceprojektowe;

import java.util.Objects;

public class Car {
    private final CarBrand brand;
    private final CarModel model;
    private final long kilometersTraveled;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.kilometersTraveled = builder.kilometersTraveled;
    }

    public static class CarBuilder {
        private CarBrand brand;
        private CarModel model;
        private long kilometersTraveled;

        public CarBuilder brand(CarBrand brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder model(CarModel model) {
            this.model = model;
            return this;
        }

        public CarBuilder kilometersTraveled(long kilometersTraveled) {
            this.kilometersTraveled = kilometersTraveled;
            return this;
        }

        public Car build() throws InvalidCarModelException {
            Objects.requireNonNull(brand, "Brand must not be null");
            Objects.requireNonNull(model, "Model must not be null");

            if (model.getCarBrand() != brand) {
                throw new InvalidCarModelException("Can't connect " + model.getCarBrand() + " with " + brand);
            }

            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model=" + model +
                ", kilometersTraveled=" + kilometersTraveled +
                '}';
    }
}
