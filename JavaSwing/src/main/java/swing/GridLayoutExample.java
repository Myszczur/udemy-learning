package swing;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;

public class GridLayoutExample extends JFrame {

    public static void main(String[] args) throws BadLocationException {

        GridLayoutExample frame = new GridLayoutExample();

        frame.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            frame.add(new JButton("" + i));
        }

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

