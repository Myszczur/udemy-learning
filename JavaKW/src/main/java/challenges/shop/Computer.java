package challenges.shop;

public class Computer extends Product {

    public Mouse mouse;
    public KeyBoard keyBoard;
    public Monitor monitor;

    Computer() {
        mouse = new Mouse();
        keyBoard = new KeyBoard();
        monitor = new Monitor();
    }
}
