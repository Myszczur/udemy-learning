package challenges.date;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        /*
            1. Stwórz instancję LocalDateTime i wywołaj now() aby otrzymać aktualną datę i czas
            2. Zrób kolejną instancję i wywołaj of() aby przekazać dowolną datę i czas z przyszłości
            3. Wywołaj isAfter na drugiej instancji względem aktualnego czasu i jesli zwróci
               true pokaż tekst w konsoli opisujący że data jest z przyszłości
         */

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime dateTime2 = LocalDateTime.of(2030, 12, 10, 22, 30, 6);

        if (dateTime2.isAfter(now)) {
            System.out.println("Data z przyszłości");
            System.out.println(dateTime2);
        }
    }
}