package challenges.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return this.name.equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class HashSetExample {
    public static void main(String args[]) {

        HashSet<Animal> set = new HashSet<>();
        Animal a = new Animal("Tiger");
        set.add(a);
        set.add(a);
        set.add(new Animal("Lion"));
        set.add(new Animal("Dog"));
        set.add(new Animal("Tiger"));

        Iterator<Animal> iterator = set.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println(animal);
        }
    }
}
