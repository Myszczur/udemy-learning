package challenges.threads.lifecycle;

public class NewThread {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Working thread");
            }
        });

        // thread.start();
        System.out.println(thread.getState()); // NEW

    }
}
