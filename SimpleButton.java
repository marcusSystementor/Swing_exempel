package Swing;
import javax.swing.*;

public class SimpleButton {

    public static void main(String[] args) {
 
       JFrame frame = new JFrame(); // Måste skapas först, containern som innehåller allt vi ser.
       
       JButton button = new JButton("Button"); // Button, skapar en knapp.

       frame.add(button); // Vi lägger till button i frame.
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Så att programmet avslutas.
       frame.setSize(800, 500); // Hur stor ska vår applikation vara?
       frame.setLocationRelativeTo(null); // Gör så att vår Frame centreras.
       frame.setVisible(true); // Måste med, annars visas inget.  


}

}