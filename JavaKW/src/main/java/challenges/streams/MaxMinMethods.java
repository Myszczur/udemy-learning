package challenges.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinMethods {
    public static void main(String args[]) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Citroen", 180, 200000, 3));
        cars.add(new Car("Opel", 220, 150000, 4));
        cars.add(new Car("Merc", 250, 400000, 5));
        cars.add(new Car("GMC", 170, 100000, 3));
        cars.add(new Car("Porsche", 300, 800000, 5));
        cars.add(new Car("Bmw", 240, 300000, 5));

        Car carHighestPrice = cars.stream()
                .max((car1, car2) -> car1.price > car2.price ? 1 : -1)
                .get();
        System.out.println(carHighestPrice);

        Car carLowestPrice = cars.stream()
                .min((car1, car2) -> car1.price > car2.price ? 1 : -1)
                .get();
        System.out.println(carLowestPrice);

        Car carHighestRating = cars.stream()
                .max((car1, car2) -> car1.rating > car2.rating ? 1 : -1)
                .get();
        System.out.println(carHighestRating);

    }
}
