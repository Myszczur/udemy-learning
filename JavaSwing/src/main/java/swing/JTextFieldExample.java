package swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class JTextFieldExample extends JFrame {
    public static void main(String[] args) {

        JTextFieldExample frame = new JTextFieldExample();

        JTextField t = new JTextField("text", 10);

        t.setText("new Text");
        t.setFont(new Font("Arial", Font.BOLD, 15));
        t.addActionListener(e -> System.out.println("action Preformed: " + t.getText()));

        t.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("insertUpdate: " + t.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("removeUpdate: " + t.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        frame.add(t);

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
