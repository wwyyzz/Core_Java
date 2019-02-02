package v1.ch12.dialog;

import javax.swing.*;
import java.awt.*;

/**
 * @program: Core_Java
 * @description: dialog
 * @author: Jun Wang
 * @create: 2019-01-23 14:36
 */
public class dialogTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            JFrame dialogFrameTest = new DialogFrame();
            dialogFrameTest.setTitle("RadioButton");
            dialogFrameTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dialogFrameTest.setVisible(true);

        });
    }

}
