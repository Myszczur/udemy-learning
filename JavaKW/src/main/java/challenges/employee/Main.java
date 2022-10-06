package challenges.employee;

public class Main {
    public static void main(String[] args) {

 /*
	1. Dodaj klasę Employee która będzie podstawą kolejnych klas.
	   Ma posiadać pola name i surname, pusty konstruktor oraz
	   drugi konstruktor przyjmujący name i surname ustawiający te pola.
	   Dodatkowo potrzebna jest metoda printInfo() pokazująca w konsoli dane klasy
	2. Zapisz klasę Administrator która rozszerza Employee i ma pole String
	   o nazwie certificates. Dodaj również konstruktor ustawiający name, surname
	   i certificates oraz metodę printInfo() pokazujące dane instancji w konsoli.
	3. Dodaj klasę Programmer rozszerzającą Employee i mającą pole String languages.
	   Dodatkowo zapisz konstruktor przyjmujący parametry name, surname i languages.
	4. W klasie Main stwórz po jednej instancji Employee, Administrator i Programmer.
       Wywołaj printInfo() na każdej z nich.
	5. Dla testu dodaj final przed Employee aby sprawdzić czy pojawi się błąd
	   kompilacji o braku możliwości rozszerzania klasy.
*/
        Employee employee = new Employee("Ola", "Kowalska");
        employee.printInfo();

        Programmer programmer = new Programmer("Kasia", "Mirkowska",
                "JavaScript");
        programmer.printInfo();

        Administrator administrator = new Administrator("Rafał", "Kowalski",
                "Cert #1");
        administrator.printInfo();
    }
}