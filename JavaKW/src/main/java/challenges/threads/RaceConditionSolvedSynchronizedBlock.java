package challenges.threads;

public class RaceConditionSolvedSynchronizedBlock {
    public int counter = 0;

    public void increment() {
        synchronized (this) {
            this.counter++;
        }
    }

    public static void main(String[] args)
            throws InterruptedException {

        RaceConditionSolvedSynchronizedBlock example =
                new RaceConditionSolvedSynchronizedBlock();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200000; i++) {
                    example.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200000; i++) {
                    example.increment();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();


        System.out.println("Counter: " + example.counter);

    }
}
