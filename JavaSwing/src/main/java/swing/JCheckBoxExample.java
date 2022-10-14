package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

class MyIcon implements Icon {
    Color color;
    String text;

    public MyIcon(Color color, String text) {
        this.color = color;
        this.text = text;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(color);
        g.drawString(text, 10, 10);

    }

    @Override
    public int getIconWidth() {
        return 32;
    }

    @Override
    public int getIconHeight() {
        return 32;
    }
}

public class JCheckBoxExample extends JFrame {
    public static void main(String[] args) {

        JCheckBoxExample frame = new JCheckBoxExample();

        JCheckBox box = new JCheckBox("Opcja 1");
        box.setSelected(true);

        box.addItemListener(e -> {
            switch (e.getStateChange()) {
                case ItemEvent.SELECTED -> System.out.println("check1 selected");
                case ItemEvent.DESELECTED -> System.out.println("check1 deselected");
            }
        });
        box.setBounds(10, 10, 100, 50);
        frame.add(box);

        MyIcon myIcon = new MyIcon(Color.BLACK, "Normal");
        MyIcon rollover = new MyIcon(Color.RED, "rollover");
        MyIcon selected = new MyIcon(Color.GREEN, "selected");
        JCheckBox box2 = new JCheckBox(myIcon);
        box2.setRolloverIcon(rollover);
        box2.setSelectedIcon(selected);

        box2.setBounds(10, 80, 100, 50);
        frame.add(box2);


        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
