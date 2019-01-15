package ch10.simpleFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @program: Core_Java
 * @description: simpleFrame
 * @author: Jun Wang
 * @create: 2019-01-15 16:36
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            SimpleFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setLocation(100, 100);
            frame.setTitle("SimpleFrameTest");
        });
    }
}

class SimpleFrame extends JFrame
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public SimpleFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
