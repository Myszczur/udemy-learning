package swing;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class JListExample extends JFrame {

    public static void main(String[] args) {

        JListExample frame = new JListExample();

        DefaultListModel<String> df = new DefaultListModel<>();
        df.addElement("Java");
        df.addElement("C++");
        df.addElement("Python");
        df.addElement("TypeScript");

        JList<String> list = new JList<>(df);

        list.addListSelectionListener(e -> {
            if (e.getValueIsAdjusting()) {
                return;
            }
            int[] indices = list.getSelectedIndices();
            Arrays.stream(indices)
                    .forEach(it -> System.out.println(list.getModel().getElementAt(it)));
        });

        frame.add(list);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
