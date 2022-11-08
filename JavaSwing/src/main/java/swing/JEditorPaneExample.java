package swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class JEditorPaneExample extends JFrame {

    public static void main(String[] args) {
        JEditorPaneExample frame = new JEditorPaneExample();

        JEditorPane editorPane = new JEditorPane(
                "text/html",
                "<html><h5><p>Lorem ipsum</p><p>Lorem ipsum</p></h5></html>"
        );

        editorPane.setEditable(true);
        editorPane.getDocument().addDocumentListener(
                new DocumentListener() {
                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        System.out.println("insertUpdate");
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        System.out.println("removeUpdate: " + editorPane.getText());
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        System.out.println("changeUpdate");
                    }
                }
        );

        JScrollPane scrollPane = new JScrollPane(editorPane);

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
