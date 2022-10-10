package challenges.streams;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalCreateOfNullableEmpty {
    public static void main(String[] args) {
        // Optional.of() tworzy Optional, który nie może być null
        Optional<String> opt1 = Optional.of("test");
        System.out.println(opt1.get());

        //  java.lang.NullPointerException
        // Optional<String> opt2 = Optional.of(null);

        Optional<String> opt3 = Optional.of("optional 3");
        System.out.println(opt3.get()); // optional 3

        Optional<String> opt4 = Optional.empty();
        System.out.println(opt4); // Optional empty

        Optional<String> opt5 = Optional.empty();
        System.out.println(opt5); // Optional empty

        Integer integer = 10;
        //integer = null;
        Optional<Integer> optInt = Optional.of(integer);

        if (optInt.isPresent()) {
            System.out.println(optInt.get());
        } else {
            System.out.println("optInt jest null");
        }

        optInt.ifPresent(System.out::println);
        optInt.ifPresent(System.out::println);
    }
}
