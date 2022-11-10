package swing;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.BadLocationException;
import java.awt.*;

public class BorderLayoutManager extends JFrame {

    public static void main(String[] args) throws BadLocationException {

        BorderLayoutManager frame = new BorderLayoutManager();

        frame.setLayout(new BorderLayout());

        Border border = BorderFactory.createLineBorder(Color.BLACK);

        JLabel north = new JLabel("North", JLabel.CENTER);
        north.setBorder(border);
        frame.add(north, BorderLayout.NORTH);

        JLabel west = new JLabel("west", JLabel.CENTER);
        north.setBorder(border);
        frame.add(west, BorderLayout.WEST);

        JLabel south = new JLabel("south", JLabel.CENTER);
        north.setBorder(border);
        frame.add(south, BorderLayout.SOUTH);

        JLabel center = new JLabel("center", JLabel.CENTER);
        north.setBorder(border);
        frame.add(center, BorderLayout.CENTER);

        JLabel east = new JLabel("east", JLabel.CENTER);
        north.setBorder(border);
        frame.add(east, BorderLayout.EAST);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
