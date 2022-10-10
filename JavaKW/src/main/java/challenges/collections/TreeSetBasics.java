package challenges.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasics {
    public static void main(String args[]) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(56);
        treeSet.add(4);
        treeSet.add(23);
        treeSet.add(1);

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator<Integer> descendingIterator = treeSet.descendingIterator();

        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}
