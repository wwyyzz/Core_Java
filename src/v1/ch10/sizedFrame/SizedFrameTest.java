package v1.ch10.sizedFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @program: Core_Java
 * @description: sizedFrame
 * @author: Jun Wang
 * @create: 2019-01-15 16:51
 */
public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
                {
                    JFrame frame = new SizedFrame();
                    frame.setTitle("SizedFrame");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }
}

class SizedFrame extends JFrame
{
    public SizedFrame()
    {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize( screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);


    }

}
