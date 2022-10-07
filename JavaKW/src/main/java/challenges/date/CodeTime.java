package challenges.date;

import java.util.Date;

public class CodeTime {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        try {
            for (int i = 10; i > 0; i--) {
                System.out.println(new Date().getTime());
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        long timeElapsed = end - start;
        System.out.println(timeElapsed);
    }
}
