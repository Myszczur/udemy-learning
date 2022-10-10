package challenges.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    private int priority;
    private String name;

    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Task o) {
        int a = this.priority;
        int b = o.priority;

        if (a == b) return 0;
        if (a > b)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                '}';
    }
}

// kolejność malejąca
class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        int x = o1.getPriority();
        int y = o2.getPriority();

        if (x == y) return 0;
        if (x < y)
            return 1;
        else
            return -1;
    }
}


public class TaskComparableExample {
    public static void main(String args[]) {
        PriorityQueue<Task> test = new PriorityQueue<>();
        test.add(new Task(7, "Zakupy"));
        test.add(new Task(1, "Praca"));
        test.add(new Task(10, "Film"));
        test.add(new Task(4, "Nauka"));

        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }

        System.out.println("\n");
        test = new PriorityQueue<>(new TaskComparator());
        test.add(new Task(7, "Zakupy"));
        test.add(new Task(1, "Praca"));
        test.add(new Task(10, "Film"));
        test.add(new Task(4, "Nauka"));

        while (!test.isEmpty()) {
            System.out.println(test.poll());
        }
    }
}
