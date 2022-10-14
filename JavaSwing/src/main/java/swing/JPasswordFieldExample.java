package swing;

import javax.swing.*;
import java.awt.*;

public class JPasswordFieldExample extends JFrame {
    public static void main(String[] args) {

        JPasswordFieldExample frame = new JPasswordFieldExample();

        JPasswordField pass = new JPasswordField(10);

        frame.add(pass);

        pass.addActionListener(e -> System.out.println("password: " + new String(pass.getPassword())));

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
