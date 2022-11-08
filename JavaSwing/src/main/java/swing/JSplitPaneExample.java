package swing;

import javax.swing.*;
import java.awt.*;

public class JSplitPaneExample extends JFrame {

    public static void main(String[] args) {

        JSplitPaneExample frame = new JSplitPaneExample();

        JPanel panel1 = new JPanel();
        String[] cars = {"Ford", "Pontiac"};
        panel1.add(new JComboBox<>(cars));

        JPanel panel2 = new JPanel();
        String[] bikes = {"Honda", "BMW"};
        panel2.add((new JComboBox<>(bikes)));

        JSplitPane pane = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                panel1,
                panel2
        );

        frame.add(pane, BorderLayout.CENTER);

        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


