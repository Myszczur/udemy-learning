package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JRadioButtonExample extends JFrame {

    public static void main(String[] args) {

        JRadioButtonExample frame = new JRadioButtonExample();

        JRadioButton radioButton1 = new JRadioButton("Car");
        JRadioButton radioButton2 = new JRadioButton("Plane");
        JRadioButton radioButton3 = new JRadioButton("Train");

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        ActionListener listener = e -> {
            JRadioButton b = (JRadioButton) e.getSource();
            System.out.println("Clicked: " + b.getText());
//                System.out.println(radioButton1.isSelected());
        };

        radioButton1.addActionListener(listener);
        radioButton2.addActionListener(listener);
        radioButton3.addActionListener(listener);

        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);


        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

