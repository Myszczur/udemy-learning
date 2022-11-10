package swing;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;

public class CardLayoutExample extends JFrame {

    public static void main(String[] args) throws BadLocationException {

        CardLayoutExample frame = new CardLayoutExample();
        Container pane = frame.getContentPane();
        CardLayout layout = new CardLayout();
        pane.setLayout(layout);

        for (int i = 0; i < 5; i++) {
            JButton b = new JButton("" + i);
            pane.add(b, "button" + i);

            final int num = i;
            b.addActionListener(e -> {
                int nextId = num + 1;
                if (nextId >= 5) {
                    nextId = 0;
                }
                layout.show(pane, "button" + nextId);
            });
        }

        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


