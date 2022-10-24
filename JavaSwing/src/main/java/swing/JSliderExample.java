package swing;

import javax.swing.*;
import java.awt.*;

public class JSliderExample extends JFrame {

    public static void main(String[] args) {

        JSliderExample frame = new JSliderExample();

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
        slider.addChangeListener(e -> System.out.println("slider: " + slider.getValue()));

        frame.add(slider);

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
