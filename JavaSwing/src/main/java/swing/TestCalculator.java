package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalculator {
    private JLabel screen;
    private boolean start; // user zaczyna pisać w kalkulatorze
    private String lastCommand;
    private double result;

    public TestCalculator() {
        start = true;
        lastCommand = "=";
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
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String button : buttons) {
            panel.add(addButton(button));
        }

        return panel;
    }

    private JButton addButton(String name) {
        JButton b = new JButton(name);
        b.setFont(new Font("Arial", Font.BOLD, 16));
        b.addActionListener(calcListener);
        return b;
    }

    private ActionListener calcListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String v = ((JButton) e.getSource()).getText();
            if ("/+-*=".contains(v)) {
                calculate(v);
            } else {
                insertNumber(v);
            }
        }
    };

    public void calculate(String s) {
        System.out.println("calculate: " + s);

        double num = Double.parseDouble(screen.getText());
        if (lastCommand.equals("=")) result = num;
        if (lastCommand.equals("+")) result += num;
        if (lastCommand.equals("*")) result *= num;
        if (lastCommand.equals("-")) result -= num;
        if (lastCommand.equals("/")) result /= num;
        screen.setText("" + result);
        lastCommand = s;
        start = true;
    }

    public void insertNumber(String s) {
        if (start) {
            screen.setText("");
            start = false;
        }
        System.out.println("insertNumber: " + s);
        screen.setText(screen.getText() + s);
    }

    public static void main(String[] args) {
        TestCalculator calc = new TestCalculator();
    }
}