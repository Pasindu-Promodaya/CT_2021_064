package Q_03;

import javax.swing.*;
import java.awt.event.*;

public class ButtonClickMessage extends JFrame {
    public ButtonClickMessage() {
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> JOptionPane.showMessageDialog(this, "You clicked!"));

        add(button);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Click Button");
        setVisible(true);
    }
}