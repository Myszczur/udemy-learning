package swing;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;

public class FlowLayoutExample extends JFrame {

    public static void main(String[] args) throws BadLocationException {

        FlowLayoutExample frame = new FlowLayoutExample();

        frame.setLayout(new FlowLayout());

        for (int i = 0; i < 9; i++) {
            frame.add(new JButton("" + i));
        }

        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


