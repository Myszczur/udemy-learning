package swing;

import javax.swing.*;
import java.awt.*;

public class JColorChooserExample extends JFrame {

    public static void main(String[] args) {

        JColorChooserExample frame = new JColorChooserExample();

        Color color = JColorChooser.showDialog(frame, "Wybierz kolor", Color.BLUE);

        System.out.println("Wybrany kolor: " + color);

        JLabel label = new JLabel("Label");

        frame.add(label);
        label.setForeground(color);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

