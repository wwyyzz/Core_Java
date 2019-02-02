package v1.ch12.checkBox;

import javax.swing.*;
import java.awt.*;

/**
 * @program: Core_Java
 * @description: checkbox
 * @author: Jun Wang
 * @create: 2019-01-22 18:53
 */
public class CheckBoxFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            JFrame checkBoxFrameTest = new CheckBoxFrame();
            checkBoxFrameTest.setTitle("RadioButton");
            checkBoxFrameTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            checkBoxFrameTest.setVisible(true);

        });
    }
}
