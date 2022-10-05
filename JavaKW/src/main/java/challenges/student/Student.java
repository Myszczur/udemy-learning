package challenges.student;

public class Student {
    String name;
    String surname;
    String city;
    int age;

    public Student() {
        this.name = "Jan";
        this.surname = "Kowalski";
        this.city = "Kraków";
        this.age = 19;
    }

    Student(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    public void printBasicData() {
        System.out.println(this.name + " " + this.surname + " " + this.city + " " + this.age);
    }
}
