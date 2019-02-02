package v1.ch10.notHelloWorld;



import javax.swing.*;
import java.awt.*;

/**
 * @program: Core_Java
 * @description: notHelloWorld
 * @author: Jun Wang
 * @create: 2019-01-15 17:12
 */
public class NotHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
                {
                    JFrame frame = new NotHelloWorldFrame();
                    frame.setTitle("SizedFrame");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }
}

class NotHelloWorldFrame extends JFrame
{
    public NotHelloWorldFrame()
    {
        add(new NotHelloWorldComponent());
        pack();
    }
}

class NotHelloWorldComponent extends JComponent
{
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    @Override
    protected void paintComponent(Graphics g) {
        g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}