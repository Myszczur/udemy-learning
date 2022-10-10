package challenges.threads;

public class DaemonTest {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Wątek daemon start.");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.setDaemon(true);
        thread.start();

        System.out.println(thread.isDaemon()); // true

    }
}
