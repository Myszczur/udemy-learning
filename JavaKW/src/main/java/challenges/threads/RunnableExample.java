package challenges.threads;

class RunnableClass implements Runnable {
    private int sleepTime;
    private String threadName;

    public RunnableClass(int sleepTime, String threadName) {
        this.sleepTime = sleepTime;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Wątek " + threadName + ", wartość i: " + i);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class RunnableClass2 extends RunnableClass implements Runnable {
    private Thread thread;

    public RunnableClass2(int sleepTime, String threadName) {
        super(sleepTime, threadName);
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        RunnableClass t1 = new RunnableClass(500, "thread1");
        Thread thread1 = new Thread(t1, "thread1");
        thread1.start();

        RunnableClass t2 = new RunnableClass(1000, "thread2");
        Thread thread2 = new Thread(t2, "thread2");
        thread2.start();

        RunnableClass2 t3 = new RunnableClass2(300, "thread3");
        t3.start();

    }
}
