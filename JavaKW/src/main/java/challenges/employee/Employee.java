package challenges.employee;

public class Employee {
    private String name;
    private String surname;

    public Employee() {
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname);
    }
}
