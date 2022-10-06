package challenges.shop;

public class Shop {
    public static void main(String[] args) {

        Product product = new Product();
        Mouse mouse = new Mouse();
        VerticalMouse verticalMouse = new VerticalMouse();
        Monitor monitor = new Monitor();
        KeyBoard keyBoard = new KeyBoard();
        Computer computer = new Computer();

        System.out.println(computer.monitor.resolution);
    }
}
