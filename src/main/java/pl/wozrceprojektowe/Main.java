package pl.wozrceprojektowe;

public class Main {
    public static void main(String[] args) {

        Car car = new Car.CarBuilder()
                .model(CarModel.ACCORD)
                .brand(CarBrand.HONDA)
                .build();
        System.out.println(car);

    }


}