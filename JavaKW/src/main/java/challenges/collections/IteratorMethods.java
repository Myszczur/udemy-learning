package challenges.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Dodge");
        arr.add("Pontiac");
        arr.add("Merc");

        arr.iterator().forEachRemaining(element -> {
            System.out.println(element);
        });

        Iterator<String> iterator = arr.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equalsIgnoreCase("merc")) {
                iterator.remove();
            }
        }

        System.out.println(arr);
    }
}
