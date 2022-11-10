package swing;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;

public class ToolTipApp extends JFrame {

    public static void main(String[] args) throws BadLocationException {

        ToolTipApp frame = new ToolTipApp();

        JButton b1 = new JButton("Click me!");
        b1.setToolTipText("Kliknij mnie");

        Image image = (new ImageIcon("files\\city.jpg")).getImage();
        frame.setIconImage(image);

        frame.setLayout(new FlowLayout());
        frame.add(b1);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}