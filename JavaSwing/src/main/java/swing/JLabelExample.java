package swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelExample extends JFrame {
    public static void main(String[] args) {
        JLabelExample frame = new JLabelExample();

        JLabel l1 = new JLabel();
        l1.setText("Label1");
        l1.setBounds(10, 10, 80, 50);
        l1.setForeground(Color.BLUE);
        l1.setOpaque(true);
        l1.setBackground(Color.WHITE);
        l1.setHorizontalAlignment(JLabel.CENTER);

        Border border = BorderFactory.createLineBorder(Color.RED, 3);
        l1.setBorder(border);
        frame.add(l1);

        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
