package swing;

import javax.swing.*;
import java.awt.*;

public class JScrollBarExample extends JFrame {

    public static void main(String[] args) {

        JScrollBarExample frame = new JScrollBarExample();

        JScrollBar scrollBar1 = new JScrollBar(Adjustable.HORIZONTAL);
        scrollBar1.setValue(20);
        scrollBar1.setMinimum(0);
        scrollBar1.setMaximum(100);
//        scrollBar1.setPreferredSize(new Dimension(35, 170));
        scrollBar1.setPreferredSize(new Dimension(180, 30));

        scrollBar1.addAdjustmentListener(e -> {
            if (e.getValueIsAdjusting()) {
                return;
            }
            System.out.println("scroll value: " + e.getValue());
        });

        frame.add(scrollBar1);

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}