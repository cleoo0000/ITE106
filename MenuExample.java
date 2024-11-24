import javax.swing.*;
import java.awt.event.*;

public class MenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JMenu fileMenu = new JMenu("File");
        JMenuItem closeItem = new JMenuItem("Close");
        closeItem.addActionListener(e -> {
            if (JOptionPane.showConfirmDialog(frame, "Do you really want to close?", "Close", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                frame.dispose();
            }
        });
        fileMenu.add(closeItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
