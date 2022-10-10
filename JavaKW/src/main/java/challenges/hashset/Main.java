package challenges.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        /*
           1. Stwórz HashSet z typem String i dodaj do niego następujące imiona:
              Ola, Kasia, Daniel, Ola, Kasia, Adam. Na koniec wyświetl wszystkie elementy
              w konsoli.
           2. Dodaj klasę Car z polem name typu String oraz konstruktorem,
              getterem, setterem i metodą toString().
              Stwórz HashSet z typem Car i dodaj dwa razy tą samą instancję dla 3 nazw
              aut: "Dodge", "Citroen", "Opel". Wyświetl rezultat w konsoli.
         */

        HashSet<String> names = new HashSet<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");
        names.add("Ola");
        names.add("Kasia");
        names.add("Adam");

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        HashSet<Car> cars = new HashSet<>();
        Car car1 = new Car("Dodge");
        cars.add(car1);
        cars.add(car1);
        Car car2 = new Car("Citroen");
        cars.add(car2);
        cars.add(car2);
        Car car3 = new Car("Opel");
        cars.add(car3);
        cars.add(car3);

        Iterator<Car> carsIterator = cars.iterator();
        while (carsIterator.hasNext()) {
            System.out.println(carsIterator.next());
        }
    }
}
