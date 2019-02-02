package v1.ch12.radioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @program: Core_Java
 * @description: radio
 * @author: Jun Wang
 * @create: 2019-01-22 18:12
 */
public class RadioButtonFrame extends JFrame {
    private JPanel buttonPanel;
    private ButtonGroup group;
    private JLabel label;
    private static final int DEFAULT_SIZE = 36;

    public RadioButtonFrame()
    {
        label = new JLabel("The quick brown fox jumps over the lazy doy.");
        label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        add(label, BorderLayout.CENTER);

        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addRadioButton("Small", 8);
        addRadioButton("Medium", 12);
        addRadioButton("Large", 18);
        addRadioButton("Extra large", 36);

        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    public void addRadioButton(String name, int size)
    {
        boolean selected = size == DEFAULT_SIZE;
        JRadioButton button = new JRadioButton(name, selected);
        group.add(button);
        buttonPanel.add(button);

        ActionListener listener = event -> label.setFont(new Font("Serif", Font.PLAIN, size));

        button.addActionListener(listener);
    }
}
