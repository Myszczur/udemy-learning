package challenges.carfactory;

public class CarFactory {

    CarFactory() {
    }

    public Car buildCar() {
        String colors[] = {"black", "white", "red"};
        int randIndex = (int) Math.floor(Math.random() * colors.length);
        String randColor = colors[randIndex];

        return new Car("Ford", "Mustang", randColor);
    }
}
