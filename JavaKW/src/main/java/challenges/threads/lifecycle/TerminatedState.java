package challenges.threads.lifecycle;

public class TerminatedState {
    public static void main(String[] args)
            throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread run");
            }
        });

        thread.start();

        Thread.sleep(100);
        System.out.println("Thread state: " + thread.getState()); // TERMINATED

    }
}
