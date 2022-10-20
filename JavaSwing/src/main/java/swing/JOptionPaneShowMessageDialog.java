package swing;

import javax.swing.*;

public class JOptionPaneShowMessageDialog extends JFrame {

    public static void main(String[] args) {

        JOptionPaneShowMessageDialog frame = new JOptionPaneShowMessageDialog();

//        JOptionPane.showMessageDialog(frame, "Hello World", "Title", JOptionPane.PLAIN_MESSAGE);

        ImageIcon imageIcon = new ImageIcon("files//city_small.jpg");

        JOptionPane.showMessageDialog(null, "<htmL><u>Hello World</u></html>",
                "Title", JOptionPane.ERROR_MESSAGE, imageIcon);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
    }
}
