package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JMenuBarExample extends JFrame {

    public static void main(String[] args) {

        JMenuBarExample frame = new JMenuBarExample();
        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        menuBar.add(file);

        JMenuItem newFile = new JMenuItem("New");
        file.add(newFile);
        JMenuItem open = new JMenuItem("Open");
        file.add(open);
        JMenuItem closeFile = new JMenuItem("Close");
        file.add(closeFile);

        // Submenu
        JMenu latestFiles = new JMenu("Latest");
        JMenuItem file1 = new JMenuItem("File 1");
        latestFiles.add(file1);
        JMenuItem file2 = new JMenuItem("File 2");
        latestFiles.add(file2);
        JMenuItem file3 = new JMenuItem("File 3");
        latestFiles.add(file3);

        JMenu edit = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        edit.add(cut);
        JMenuItem copy = new JMenuItem("Copy");
        edit.add(copy);
        JMenuItem paste = new JMenuItem("Paste");
        edit.add(paste);

        menuBar.add(edit);

        file.addSeparator();
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);

        file.add(latestFiles);

        JCheckBoxMenuItem checkBox = new JCheckBoxMenuItem("Check Box");
        file.add(checkBox);

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("Radio 1");
        JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Radio 2", true);
        JRadioButtonMenuItem radio3 = new JRadioButtonMenuItem("Radio 3");
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);
        buttonGroup.add(radio3);
        file.add(radio1);
        file.add(radio2);
        file.add(radio3);

        ActionListener listener = e -> {
            Object source = e.getSource();
            if (source.equals(exit)) {
                System.exit(0);
            }
            if (source instanceof JMenuItem) {
                System.out.println(((JMenuItem) source).getText());
            }
            if (source.equals(checkBox)) {
                System.out.println("CheckBox selected: " + checkBox.isSelected());
            }
            if (source instanceof JRadioButtonMenuItem) {
                System.out.println("Selected radio: " + ((JRadioButtonMenuItem) source).getText());
            }
        };

        radio1.addActionListener(listener);
        radio2.addActionListener(listener);
        radio3.addActionListener(listener);
        checkBox.addActionListener(listener);
        exit.addActionListener(listener);
        newFile.addActionListener(listener);
        open.addActionListener(listener);
        closeFile.addActionListener(listener);
        file1.addActionListener(listener);
        file2.addActionListener(listener);
        file3.addActionListener(listener);
        cut.addActionListener(listener);
        copy.addActionListener(listener);
        paste.addActionListener(listener);

        frame.setJMenuBar(menuBar);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
