package challenges.files;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź ilość liczb do dodania:");
        int numNumbers = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < numNumbers; i++) {
            System.out.println("Wprowadź kolejną liczbę całkowitą do dodania:");
            sum += scanner.nextInt();
        }

        System.out.println("Suma wszystkich liczb to: " + sum);

    }
}
