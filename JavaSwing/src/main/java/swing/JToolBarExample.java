package swing;

import javax.swing.*;
import java.awt.*;

public class JToolBarExample extends JFrame {
    public static void main(String[] args) {

        JToolBarExample frame = new JToolBarExample();

        JToolBar toolBar = new JToolBar();
        JButton btn1 = new JButton("Click me!");
        toolBar.add(btn1);
        JToggleButton b2 = new JToggleButton("Click me too!");
        toolBar.add(b2);


        frame.add(toolBar);

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
