package v1.ch12.radioButton;

import v1.ch12.text.TextComponentFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @program: Core_Java
 * @description: radio
 * @author: Jun Wang
 * @create: 2019-01-22 18:27
 */
public class RadioButtonTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            JFrame radioButtonFrame = new RadioButtonFrame();
            radioButtonFrame.setTitle("RadioButton");
            radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            radioButtonFrame.setVisible(true);

        });
    }

}
