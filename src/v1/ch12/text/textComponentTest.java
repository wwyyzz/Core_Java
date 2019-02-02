package v1.ch12.text;

import javax.swing.*;
import java.awt.*;

/**
 * @program: Core_Java
 * @description: text
 * @author: Jun Wang
 * @create: 2019-01-21 17:18
 */
public class textComponentTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            JFrame textFrame = new TextComponentFrame();
            textFrame.setTitle("textText");
            textFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            textFrame.setVisible(true);

        });
    }
}
