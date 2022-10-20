package swing;

import javax.swing.*;

public class JOptionPaneShowConfirmDialog {

    public static void main(String[] args) {

        int result = JOptionPane.showConfirmDialog(
                null,
                "czy zapisać dane?",
                "Dane zmodyfikowane",
                JOptionPane.YES_NO_CANCEL_OPTION
        );

        String str = switch (result) {
            case JOptionPane.YES_OPTION -> "Yes";
            case JOptionPane.NO_OPTION -> "No";
            case JOptionPane.CANCEL_OPTION -> "Cancel";
            default -> "";
        };

        System.out.println(str);
    }
}
