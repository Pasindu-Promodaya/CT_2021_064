package Q_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TitleChanger extends JFrame {
    public TitleChanger() {
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Set Title");

        button.addActionListener(e -> setTitle(textField.getText()));

        setLayout(new FlowLayout());
        add(textField);
        add(button);

        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}