// A class with a more simple layout so you can add more
// components.

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleLayout implements ActionListener{


       private JFrame frame;
       private JButton button;
       private JButton button2;

       
       public SimpleLayout() {

       frame = new JFrame("Button");
       button = new JButton("Button");
       button2 = new JButton("Button");
      
       createButtonGUI();

      }

      private void createButtonGUI() {
      
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.add(button);
        panel.add(button2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        button.addActionListener(this);
        frame.setVisible(true);

       }



    @Override
    public void actionPerformed(ActionEvent e) {

      
      
    }

       

  


}


    

