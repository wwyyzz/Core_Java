package v1.ch12.checkBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @program: Core_Java
 * @description: checkbox
 * @author: Jun Wang
 * @create: 2019-01-22 18:45
 */
public class CheckBoxFrame extends JFrame {
    private JLabel lable;
    private JCheckBox bold;
    private JCheckBox italic;
    public static final int FONTSIZE = 24;

    public CheckBoxFrame()
    {
        lable = new JLabel("The quick brown fox jumps over the lazy dog.");
        lable.setFont(new Font("Serif", Font.BOLD, FONTSIZE));
        add(lable, BorderLayout.CENTER);

        ActionListener listener = event ->
        {
            int mode = 0;
            if (bold.isSelected()) mode += Font.BOLD;
            if (italic.isSelected()) mode += Font.ITALIC;
            lable.setFont(new Font("Serif", mode, FONTSIZE));
        };

        JPanel buttonPanel = new JPanel();

        bold = new JCheckBox("Bold");
        bold.addActionListener(listener);
        bold.setSelected(true);
        buttonPanel.add(bold);

        italic = new JCheckBox("Italic");
        italic.addActionListener(listener);
        buttonPanel.add(italic);

        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }
}
