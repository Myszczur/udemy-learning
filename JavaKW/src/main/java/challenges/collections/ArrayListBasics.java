package challenges.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String args[]) {
        ArrayList basicList = new ArrayList();
        basicList.add(new String("test"));
        basicList.add("info");

        String strEl = (String) basicList.get(0);
        // System.out.println(strEl);

        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Kasia");
        arrStr.add("Adam");
        arrStr.add("Anna");
        arrStr.remove(1);
        arrStr.add("Olek");

        for (String s : arrStr) {
            System.out.println(s);
        }

        /*
        Kasia
        Anna
        Olek
         */

        arrStr.add(0, "Zuza");
        for (String s : arrStr) {
            System.out.println(s);
        }
        /*
        Olek
        Zuza
        Kasia
        Anna
        Olek
         */

        System.out.println("\n after set:");
        arrStr.set(1, "Katarzyna");
        for (String s : arrStr) {
            System.out.println(s);
        }

        /*
        Zuza
        Katarzyna
        Anna
        Olek
         */

        System.out.println("\n after sorting:");
        Collections.sort(arrStr);
        for (String s : arrStr) {
            System.out.println(s);
        }
        /*
        Anna
        Katarzyna
        Olek
        Zuza
         */

        System.out.println("\n after removing element");
        arrStr.remove(0);
        for (String s : arrStr) {
            System.out.println(s);
        }
        /*
        Katarzyna
        Olek
        Zuza
         */

    }
}
