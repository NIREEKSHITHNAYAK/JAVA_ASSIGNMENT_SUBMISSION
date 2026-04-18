/* 4c Develop a Swing program in Java to display a message “Digital Clock is pressed” 
 * or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by 
 * implementing the event handling mechanism with addActionListener( ).*/
package fourC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo implements ActionListener {

    JFrame frame;
    JButton btnClock, btnHourGlass;
    JLabel label;

    public ImageButtonDemo() {

        // Create Frame
        frame = new JFrame("Image Button Demo");
        frame.setSize(500, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load Images (Make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Create Buttons with images
        btnClock = new JButton("Digital Clock", clockIcon);
        btnHourGlass = new JButton("Hour Glass", hourglassIcon);

        // Create Label
        label = new JLabel("Click a button");

        // Add ActionListener
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Add components
        frame.add(btnClock);
        frame.add(btnHourGlass);
        frame.add(label);

        // Show frame
        frame.setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnClock) {
            label.setText("Digital Clock is pressed");
        } 
        else if (e.getSource() == btnHourGlass) {
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}