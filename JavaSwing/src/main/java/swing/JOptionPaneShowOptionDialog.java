package swing;

import javax.swing.*;

public class JOptionPaneShowOptionDialog {

    public static void main(String[] args) {

        String[] options = {"Save", "Load latest", "Compile", "Abort"};

        int result = JOptionPane.showOptionDialog(
                null,
                "What to do with project?",
                "Project 001",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        System.out.println("Wybroano: " + options[result]);

        JTextArea area = new JTextArea(8, 16);
        JTextField email = new JTextField(10);

        Object[] options2 = {
                new JLabel("Email: "),
                email,
                "Send",
                "Cancel"
        };

        int result2 = JOptionPane.showOptionDialog(
                null,
                area,
                "Send email",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[3]
        );

        System.out.println("TextArea: " + area.getText());
        System.out.println("Email: " + email.getText());
        System.out.println("Result 2 " + result2);
    }
}
