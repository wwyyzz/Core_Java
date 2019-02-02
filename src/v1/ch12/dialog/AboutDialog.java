package v1.ch12.dialog;

import javax.swing.*;
import java.awt.*;

/**
 * @program: Core_Java
 * @description: about
 * @author: Jun Wang
 * @create: 2019-01-23 14:24
 */
public class AboutDialog extends JDialog {

    public AboutDialog(JFrame owner) {
        super(owner, "About DialogTest", true);

        add(
                new JLabel(
                        "<html><h1><i>Core Java</i><hr><By Cay Horstmann</html>"),
                        BorderLayout.CENTER
        );
        JButton ok = new JButton("OK");
        ok.addActionListener(event -> setVisible(false));

        JPanel panel = new JPanel();
        panel.add(ok);
        add(panel, BorderLayout.SOUTH);

        pack();

    }
}
