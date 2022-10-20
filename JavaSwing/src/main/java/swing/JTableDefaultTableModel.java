package swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class JTableDefaultTableModel extends JFrame {


    public static void main(String[] args) {

        JTableDefaultTableModel frame = new JTableDefaultTableModel();

        String[] columns = {"Manufacturer", "Name", "Year", "Top Speed"};
        String[][] data = {
                {"Ford", "T", "1920", "40"},
                {"Ford", "Mustang", "1970", "200"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columns);

        JTable table = new JTable(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane pane = new JScrollPane(table);
        pane.setPreferredSize(new Dimension(300, 100));

        model.insertRow(1, new Object[]{"Dodge", "Charger", "1971", "200"});
        model.insertRow(model.getRowCount(), new Object[]{"Dodge", "Charger", "1972", "200"});

        table.setCellSelectionEnabled(true);
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        ListSelectionModel listSelectionModel = table.getSelectionModel();
        listSelectionModel.addListSelectionListener(e -> {
            if (e.getValueIsAdjusting()) {
                return;
            }
            ArrayList<String> arr = new ArrayList<>();
            int[] selectedRows = table.getSelectedRows();
            int[] selectedColumns = table.getSelectedColumns();

            for (int selectedRow : selectedRows) {
                for (int selectedColumn : selectedColumns) {
                    String selectedData = (String) table.getValueAt(selectedRow, selectedColumn);
                    arr.add(selectedData);
                }
            }
            System.out.println("Selected: " + arr);
        });

        table.setShowHorizontalLines(true);
        table.setGridColor(Color.BLUE);

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