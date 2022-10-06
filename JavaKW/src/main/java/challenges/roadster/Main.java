package challenges.roadster;

public class Main {
    public static void main(String[] args) {
        /*
    Stwórz klasę Roadster z zmiennymi:
    1. typu float: topSpeed, acceleration, crazyTopSpeed, crazyAcceleration

    Klasa Roadster musi mieć też dwa konstruktory:
    1. Konstruktor pierwszy przyjmuje topSpeed i acceleration i ustawia ich wartości w instancji
    2. Drugi konstruktor przyjmuje powyższe wartości oraz crazyTopSpeed i crazyAcceleration,
        ustawia w instancji wzystkie wartości razem z crazymode jako true.
    3. Metody getTopSpeed() i getAcceleration() zwracają topSpeed i acceleration
    4. Przeciążona metoda getTopSpeed(boolean crazyMode) zwraca crazyTopSpeed jeśli
       przekazano jako argument crazyMode i ma wartość true, w innym wypadku zwraca zwykłą prędkość
    5. Przeciążona metoda getAcceleration(boolean crazyMode) podobnie, jeśli przekazano
       crazyMode jako true to zwraca crazyAcceleration, jak false zwykłe przyśpieszenie
    6. Stwórz dwie instancje Car z różnymi wartościami maksymalnej prędkości
       i przyśpieszenia. Sprawdź czy wywołanie metody z crazyMode jako true daje wyższe
       wartości.
    */
        Roadster car1 = new Roadster(250.0f, 4.0f);
        System.out.println("Car1 topSpeed: " + car1.getTopSpeed());

        Roadster car2 = new Roadster(250.0f, 4.0f,
                300.0f, 1.9f);
        System.out.println("Car2 crazyTopSpeed: " + car2.getTopSpeed(true));
    }
}

