package challenges.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*
        1. Stwórz TreeSet typu Integer o nazwie numbers. Dodaj pętle for z 30 iteracjami
           i dodaj losową liczbę do TreeSet z zakresu od 0 do 100.
        2. Wyświetl w konsoli cały TreeSet
         */

        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < 30; i++) {
            int randInt = (int) Math.floor(Math.random() * 101);
            numbers.add(randInt);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
