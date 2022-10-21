package swing;

import javax.swing.*;
import java.awt.*;

public class JProgressBarExample extends JFrame {

    public static void main(String[] args) {

        JProgressBarExample frame = new JProgressBarExample();

        JProgressBar progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(100);
                        progressBar.setValue(i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        frame.add(progressBar);
        t.start();

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
