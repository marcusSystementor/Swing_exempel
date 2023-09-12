package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonClassListener implements ActionListener {

    private JFrame frame;
    private JButton button;
    
    public ButtonClassListener () {
        frame = new JFrame("Button");
        button = new JButton("Button");

        createButtonGUI();
    }

    private void createButtonGUI () {
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        button.addActionListener(this);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
          button.setText("Clicked");

    }
}
