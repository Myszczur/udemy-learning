package challenges.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        /*
            1. Stwórz Klasę Product z zmienną protected name typu String, dodaj konstruktor,
               gettery, settery i toString
            2. Dodaj zmienną products jako ArrayList z typem Product, zrób pętle for i wrzuć
               do niej 10 produktów z nazwą np Product #0 itd zwiększając numerację
            3. Powołaj Iterator typu Product z products i w pętli while z iteratorem
               pokaż kolejne produkty w konsoli
         */

        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            products.add(new Product("Product #" + i));
        }

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }
    }
}
