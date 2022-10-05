package challenges.student;

public class Main {
    public static void main(String[] args) {
         /*
            Stwórz klasę Student opisującą ucznia z następującymi zmiennymi:
            imię, nazwisko, miasto, wiek
            Dodaj do klasy dwa konstruktory:
            - pusty podstawiający domyślne wartości jak np Jan Kowalski
            - przyjmujący wszystkie powyższe dane
            Stwórz w klasie Student metodę printBasicData() pokazującą powyższe dane
            w konsoli.
            Na koniec utwórz dwóch studentów, jeden z użyciem pustego konstruktora,
            drugi z uzyciem konstruktora z przekazaniem danych studenta.
         */

        Student student1 = new Student();
        student1.printBasicData();

        Student student2 = new Student("Ola", "Kowalska", "Gdańsk", 18);
        student2.printBasicData();
    }
}
