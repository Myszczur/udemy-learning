package swing;

import javax.swing.*;
import javax.swing.text.BadLocationException;

public class BoxLayoutExample extends JFrame {

    public static void main(String[] args) throws BadLocationException {

        BoxLayoutExample frame = new BoxLayoutExample();

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

        for (int i = 0; i < 9; i++) {
            frame.add(new JButton("" + i));
        }

        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

