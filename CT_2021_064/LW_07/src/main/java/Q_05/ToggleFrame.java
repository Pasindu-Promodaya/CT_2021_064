package Q_05;

import javax.swing.*;
import java.awt.*;

public class ToggleFrame extends JFrame {
    private boolean isOn = false;  // To track toggle state
    private final JButton toggleButton;

    public ToggleFrame() {
        // Set title, size, and close behavior
        setTitle("Toggle Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout to null to directly control positions
        setLayout(null);

        // Create the button
        toggleButton = new JButton("OFF");
        toggleButton.setBounds(100, 70, 100, 40); // Position and size

        // Set initial background color to Green
        getContentPane().setBackground(Color.GREEN);

        // Add action listener to toggle color and text
        toggleButton.addActionListener(e -> toggleState());

        // Add button to the frame
        add(toggleButton);

        // Center and show the frame
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void toggleState() {
        isOn = !isOn;

        // Update button text and background color
        if (isOn) {
            toggleButton.setText("ON");
            getContentPane().setBackground(Color.RED);
        } else {
            toggleButton.setText("OFF");
            getContentPane().setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new ToggleFrame();
    }
}
