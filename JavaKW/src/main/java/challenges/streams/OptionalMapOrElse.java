package challenges.streams;

import java.util.Optional;

public class OptionalMapOrElse {
    public static void main(String[] args) {

        Integer integer = 20;
        // integer = null;
        Optional<Integer> opt = Optional.of(integer);

        Optional<Integer> opt2 = opt.map(i -> i * 3);
        System.out.println(opt2);

        System.out.println(opt2.orElse(5));

        Integer int2 = 100;
        int2 = null;
        Optional<Integer> optInt = Optional.ofNullable(int2);

        optInt.map(i -> i * 2)
                .map(i -> i + 50)
                .map(i -> i / 2)
                .ifPresent(System.out::println); // 125

    }
}
