package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonClass {

    private JFrame frame;
    private JButton button;
    
    public ButtonClass () {
        frame = new JFrame("Button");
        button = new JButton("Button");

        createButtonGUI();
    }

    private void createButtonGUI () {
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
