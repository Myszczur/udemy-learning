package challenges.wallet;

public class Main {
    public static void main(String[] args) {
        /*
        Stwórz klasę Wallet, któa w konstruktorze przyjmie kwotę początkową portfela np 3000,
        wewnątrz zostanie przechowana jako float money.
        Portfel ma metodę addMoney() z parametrem amount która doda tą kwotę do money.
        Na podobnej zasadzie zadziała removeMoney() odejmujac przekazaną kwotę.
        Ostatnią metodą portfela jest printAmount() która ma pokazać aktualną wartość portfela.

        W głównej klasie Main stwórz portfel oraz pętlę dla 6 miesięcy przychodów i wydatków.
        W każdym miesiącu do portfela dodaj 5000, również odejmij 2000 i nastepnie 1000 zł.
        Na koniec programu wyświetl podsumowanie portfela po pół roku pracy.
         */

        Wallet wallet = new Wallet(3000);

        for (int i = 1; i <= 6; i++) {
            System.out.println("Miesiąc: " + i);
            wallet.addMoney(5000);
            wallet.removeMoney(2000);
            wallet.removeMoney(1000);
        }

        System.out.println("Podsumowanie wydatków po pół roku:");
        wallet.printAmount();
    }
}

