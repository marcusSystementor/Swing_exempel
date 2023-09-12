package Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonClassJPanel implements ActionListener {

    private JFrame frame;
    private JButton button;
    private JPanel panel;
    
    public ButtonClassJPanel () {
        frame = new JFrame("Button");
        button = new JButton("Button");
        panel = new JPanel();

        createButtonGUI();
    }

    private void createButtonGUI () {
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        button.addActionListener(this);
        frame.add(panel, BorderLayout.CENTER);
        panel.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          Object source = event.getSource();
          button.setText("Clicked");

    }
}
