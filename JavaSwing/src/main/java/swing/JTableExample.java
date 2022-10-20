package swing;

import javax.swing.*;
import java.awt.*;

public class JTableExample extends JFrame {

    public static void main(String[] args) {

        JTableExample frame = new JTableExample();

        String[] columns = {"Manufacturer", "Name", "Year", "Top Speed"};
        String[][] data = {
                {"Ford", "T", "1920", "40"},
                {"Ford", "Mustang", "1970", "200"}
        };

        JTable table = new JTable(data, columns);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(table);
        pane.setPreferredSize(new Dimension(300, 100));

        table.setValueAt("35", 0, 3);
        System.out.println(table.getValueAt(1, 1));
        System.out.println("Column count: " + table.getColumnCount());
        System.out.println("Column name: " + table.getColumnName(0));

        frame.add(pane, BorderLayout.CENTER);
        frame.pack();

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

