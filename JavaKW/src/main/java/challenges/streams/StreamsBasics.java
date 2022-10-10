package challenges.streams;

import java.util.ArrayList;

public class StreamsBasics {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Asia");
        arr.add("Paweł");
        arr.add("Daniel");
        arr.add("Ola");
        arr.add("Zuzanna");
        arr.add("Zenon");

        arr.stream().filter(str -> str.length() > 3 && str.length() < 7)
                .filter(str -> str.startsWith("A") || str.startsWith("P"))
                .forEach(str -> System.out.println(str));


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Citroen", 180, 200000, 3));
        cars.add(new Car("Opel", 220, 150000, 4));
        cars.add(new Car("Merc", 250, 400000, 5));
        cars.add(new Car("GMC", 170, 100000, 3));
        cars.add(new Car("Porsche", 300, 800000, 5));
        cars.add(new Car("Bmw", 240, 300000, 5));

        cars.stream().filter(car -> car.rating > 3)
                .filter(car -> car.price >= 200000 && car.price < 600000)
                .filter(car -> car.topSpeed >= 200 && car.topSpeed < 300)
                .forEach(car -> System.out.println(car));

    }
}
