package swing;

import javax.swing.*;
import java.awt.*;

public class TestCalculator {

    private JLabel screen;

    public TestCalculator() {
        JFrame frame = new JFrame();

        screen = new JLabel("0", JLabel.RIGHT);
        screen.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(screen, BorderLayout.NORTH);

        frame.add(makeButtonsPanel(), BorderLayout.CENTER);

        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private JPanel makeButtonsPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "0", "=", "+"
        };

        for (String button : buttons) {
            panel.add(addButton(button));
        }

        return panel;
    }

    private JButton addButton(String name) {
        JButton b = new JButton();
        b.setFont(new Font("Arial", Font.BOLD, 16));
        return b;
    }

    public static void main(String[] args) {
        TestCalculator calc = new TestCalculator();
    }
}
