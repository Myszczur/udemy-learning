package challenges.tv;

public class Main {

    public static void main(String[] args) {
        /*
            Stwórz klasę Tv opisującą telewizor wraz z zmiennymi jak:
            producent, model, rok produkcji i dodatkowe, które będą
            pasowały do tego produktu.
            Dodaj jedną metodę printBasicData() prezentującą w konsoli te trzy
            powyższe wartości przechowywane w instancji klasy.
            Na koniec dodaj instancję do głównego programu i wartości do
            podstawowych pól oraz wywołaj metodę printBasicData()
        */

        Tv tv1 = new Tv();
        tv1.manufacturer = "Rubin";
        tv1.model = "Kolorowy";
        tv1.year = 1987;

        tv1.printBasicData();
    }
}
