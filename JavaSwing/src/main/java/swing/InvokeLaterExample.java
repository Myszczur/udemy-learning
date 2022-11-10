package swing;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;

class ProgressElement implements Runnable {

    private JProgressBar progressBar;

    public ProgressElement() {
        progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i += 10) {
            try {
                Thread.sleep(250);
                updateProgress(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void updateProgress(int progressNumber) {
        SwingUtilities.invokeLater(() -> progressBar.setValue(progressNumber));
    }
}

public class InvokeLaterExample extends JFrame {

    public static void main(String[] args) throws BadLocationException {

        InvokeLaterExample frame = new InvokeLaterExample();
        ProgressElement progressElement = new ProgressElement();
        frame.add(progressElement.getProgressBar());

        Thread t = new Thread(progressElement);
        t.start();

        frame.setLayout(new FlowLayout());
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


