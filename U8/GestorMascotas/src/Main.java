import javax.swing.SwingUtilities;

import ui.MainFrame;

public class Main {
    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}