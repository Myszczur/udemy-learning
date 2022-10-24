package swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSpinnerExample extends JFrame {

    public static void main(String[] args) {

        JSpinnerExample frame = new JSpinnerExample();

        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(10, -5, 15, 1);
        JSpinner spinner = new JSpinner(spinnerNumberModel);

        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("Spinner: " + spinner.getValue());
            }
        });

        frame.add(spinner);

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

