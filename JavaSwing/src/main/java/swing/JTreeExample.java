package swing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

public class JTreeExample extends JFrame {

    public static void main(String[] args) {

        JTreeExample frame = new JTreeExample();

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
        JTree tree = new JTree(root);

        DefaultMutableTreeNode cars = new DefaultMutableTreeNode("cars");
        cars.add(new DefaultMutableTreeNode("Dodge"));
        cars.add(new DefaultMutableTreeNode("Ford"));
        cars.add(new DefaultMutableTreeNode("Pontiac"));
        root.add(cars);

        DefaultMutableTreeNode bikes = new DefaultMutableTreeNode("bikes");
        bikes.add(new DefaultMutableTreeNode("Honda"));
        bikes.add(new DefaultMutableTreeNode("BMW"));
        root.add(bikes);

        for (int i = 0; i < tree.getRowCount(); i++) {
            tree.expandRow(i);
        }

        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.getSelectionModel().addTreeSelectionListener(e -> {
            Object el = e.getNewLeadSelectionPath().getLastPathComponent();
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) el;
            System.out.println("Selected: " + node.toString());
        });

        frame.add(tree);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
