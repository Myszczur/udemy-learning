package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopupMenuExample extends JFrame {

    public static void main(String[] args) {

        JPopupMenuExample frame = new JPopupMenuExample();

        JPopupMenu menu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        menu.add(copy);
        menu.add(cut);
        menu.add(paste);

        ActionListener listener = e -> {
            JMenuItem item = (JMenuItem) e.getSource();
            System.out.println("Clicked: " + item.getText());
        };

        cut.addActionListener(listener);
        copy.addActionListener(listener);
        paste.addActionListener(listener);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                menu.show(frame, e.getX(), e.getY());
            }
        });

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
