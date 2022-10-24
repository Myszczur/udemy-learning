package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogExample extends JFrame {

    public static void main(String[] args) {
        JDialogExample frame = new JDialogExample();

        JDialog jDialog = new JDialog(frame, "Dialog Frame", true);
        jDialog.setLayout(new FlowLayout());
        JButton jButton = new JButton("Close dialog");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jDialog.setVisible(false);
            }
        });
        jDialog.add(jButton);
        jDialog.setSize(300, 300);


        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        jDialog.setVisible(true);
    }
}