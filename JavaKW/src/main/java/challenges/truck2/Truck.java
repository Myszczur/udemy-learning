package challenges.truck2;

public class Truck {
    String manufacturer;
    String model;
    int numWheels;
    final float TOP_SPEED = 100;
    final float ACCELERATION;
    String color;

    Truck() {
        this.manufacturer = "Freightliner";
        this.model = "9664";
        this.numWheels = 6;
        this.ACCELERATION = 60;
    }

    Truck(String color) {
        this();
        this.color = color;
    }

    public void printInfo() {
        System.out.println(this.manufacturer + " " + this.model + " " + this.color);
    }
}
