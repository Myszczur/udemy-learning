package challenges.abstract_calsses;

public abstract class Employee {
    protected String name;
    protected String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract String toString();
}
