package ch11.mouse;

import javax.swing.*;

public class MouseFrame extends JFrame {

    public MouseFrame()
    {
        add(new MouseComponent());
        pack();
    }
}
