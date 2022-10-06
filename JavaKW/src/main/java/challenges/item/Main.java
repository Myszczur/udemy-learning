package challenges.item;

public class Main {
    public static void main(String[] args) {

    /*
	1. Stwórz klasę Item która posiada statyczną zmienną int numItems
	   o wartości  początkowej 0. Dodaj też stałą całkowitą o nazwie ID.
	2. Dodaj konstruktor przyjmujący jeden parametr całkowity id, który
	   przypisze przekazaną wartość do stałej ID.
	3. Zapisz statyczną metodę zwracającą int o nazwie getNextId(). Metoda
	   zwraca kolejny unikalny id na bazie statycznej numItems tylko pamiętaj
	   o inkrementacji tej wartości przy wywołaniu getNextId()
	4. Dodaj statyczną metodę getItem() zwracającą nowy Item, który będzie miał unikalny id
	5. Do item dodaj statyczną metodę printNumItems, która pokaże w konsoli
	   aktualną wartość numItems
	6. Kończąc Item dodaj zwykłą metodę printId() ktra pokaże w konsoli
	   wartość ID.
	7. W Main stwórz trzy elementy item np w pętli i wywołaj na nich printId()
	8. Na koniec programu wywołaj printNumItems() aby uzyskać ilość elementów Item.
*/
        for (int i = 0; i < 3; i++) {
            Item item = Item.getItem();
            item.printId();
        }

        Item.printNumItems();
    }
}