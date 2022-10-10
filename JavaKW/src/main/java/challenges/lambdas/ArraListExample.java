package challenges.lambdas;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArraListExample {
    public static void main(String args[]) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("bmw");
        arr.add("merc");
        arr.add(null);
        arr.add("pontiac");
        arr.add(null);

        arr.removeIf(a -> a == null || a.equalsIgnoreCase("merc"));

        System.out.println(arr); // [bmw, pontiac]

    }
}
