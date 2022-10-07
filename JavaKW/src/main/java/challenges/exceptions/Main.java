package challenges.exceptions;

public class Main {
    public static void main(String[] args) {

 /*
	1. W Main dodaj strukturę try catch finally w której powstanie błąd w wyniku
	   dzielenia przez zero. Złap ArithmeticException i wywołaj na wyjątku printStackTrace()
	   W finally pokaż informację o wywołaniu tego bloku kodu w konsoli.
	2. Dodaj strukturę try catch i stwórz oraz wywołaj własny wyjątek TestException.
	   Stwórz klasę wyjątku w osobnym pliku. Wywołaj printStackTrace na wyjątku.
*/
        try {
            int value = 10 / 0;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        try {
            throw new TestException();
        } catch (TestException exception) {
            exception.printStackTrace();
        }
    }
}