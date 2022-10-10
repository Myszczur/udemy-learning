package challenges.threads;

import javax.swing.*;
import java.time.LocalDateTime;

public class SwingClock extends JFrame implements Runnable {
    private Thread thread;
    String hour, minutes, seconds;
    JLabel label;

    public SwingClock() {
        label = new JLabel("", JLabel.CENTER);
        label.setBounds(5, 5, 100, 40);
        add(label);
        setSize(100, 80);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                LocalDateTime today = LocalDateTime.now();
                hour = "" + today.getHour();
                minutes = String.format("%02d", today.getMinute()); // 7:03:05
                seconds = String.format("%02d", today.getSecond());

                label.setText(hour + ":" + minutes + ":" + seconds);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingClock clock = new SwingClock();
    }
}
