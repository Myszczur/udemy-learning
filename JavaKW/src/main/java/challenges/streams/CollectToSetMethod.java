package challenges.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSetMethod {
    public static void main(String args[]) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 250, 300000, 4));
        cars.add(new Car("Citroen", 180, 200000, 3));
        cars.add(new Car("Opel", 220, 150000, 4));
        cars.add(new Car("Merc", 250, 400000, 5));
        cars.add(new Car("GMC", 170, 100000, 3));
        cars.add(new Car("Porsche", 300, 800000, 5));
        cars.add(new Car("Bmw", 240, 300000, 5));
        cars.add(new Car("Citroen", 180, 200000, 3));
        cars.add(new Car("Citroen", 180, 200000, 3));


        Set<Car> set = cars.stream().filter(car -> car.price < 300000)
                .collect(Collectors.toSet());

        set.forEach(car -> System.out.println(car));


    }
}
