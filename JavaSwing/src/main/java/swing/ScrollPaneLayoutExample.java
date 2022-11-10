package swing;

import javax.swing.*;
import javax.swing.text.BadLocationException;

public class ScrollPaneLayoutExample extends JFrame {

    public static void main(String[] args) throws BadLocationException {

        ScrollPaneLayoutExample frame = new ScrollPaneLayoutExample();

        JLabel label = new JLabel(new ImageIcon("files\\city.jpg"));
        JScrollPane scrollPane = new JScrollPane(label);
        frame.add(scrollPane);

        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

