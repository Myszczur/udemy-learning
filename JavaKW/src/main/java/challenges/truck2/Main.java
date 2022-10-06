package challenges.truck2;

public class Main {
    public static void main(String[] args) {
        /*
	1. Stwórz klase Truck
	   z zmiennymi: producent, model, ilość kół, kolor.
	2. Dodatkowo musi posiadać stałe:
	  - TOP_SPEED z wartością 100
	  - ACCELERATION ale uwaga bez wartości początkowej
	3. Dodaj pusty konstruktor, który ustawia:
	  - producenta na Freightliner
	  - model na 9664
	  - ilośc kół na 6
	  - akceleracje na na 60
	4. Drugi konstruktor
	  - przyjmuje jako parametr kolor
	  - wywołuje pusty konstruktor
	  - zapisuje kolor w instancji
	5. Dodaj metodę printInfo która pokaże producenta model i kolor w konsoli
	6. Utwórz instancję Truck przekazując kolor i wywołaj metodę printInfo()
        */
        Truck truck = new Truck("black");
        truck.printInfo();
    }
}
