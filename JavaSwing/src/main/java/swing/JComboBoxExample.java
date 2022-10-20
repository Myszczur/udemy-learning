package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class JComboBoxExample extends JFrame {

    public static void main(String[] args) {

        JComboBoxExample frame = new JComboBoxExample();
        String[] str = {"Java", "Python", "COBOL", "C#", "PHP", "JavaScript", "TypeScript"};

        JComboBox<String> comboBox = new JComboBox<>(str);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Selected: " + str[comboBox.getSelectedIndex()]);
            }
        });

        comboBox.addItemListener(e -> {
            int state = e.getStateChange();
            if (state == ItemEvent.SELECTED) {
                System.out.println(e.getItem() + " Selected");
            } else if (state == ItemEvent.DESELECTED) {
                System.out.println(e.getItem() + " Deselected");
            }
        });

        frame.add(comboBox);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

