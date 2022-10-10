package challenges.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
            1. Stwórz ArrayList typu String o nazwie names
               i dodaj trzy imiona Ola, Kasia, Daniel z metodą add()
            2. Użyj get(0) do pobrania i wyświetlenia pierwszego indeksu
            3. Wykorzystaj set() i zmień drugi indeks na wartość Olek
            4. Użyj ponownie add() na indeksie 1 z wartością Karol
            5. Wywołaj remove() na names z indeksem 0
            6. Wykorzystaj pętle for i pokaż listę w konsoli
         */

        ArrayList<String> names = new ArrayList<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");

        System.out.println("indeks 0: " + names.get(0));

        names.set(2, "Olek");
        names.add(1, "Karol");
        names.remove(0);

        System.out.println("Elementy:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}



