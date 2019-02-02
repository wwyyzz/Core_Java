package v1.ch12.optionDialog;

import javax.swing.*;
import java.awt.*;

/**
 * @program: Core_Java
 * @description: optionDialog
 * @author: Jun Wang
 * @create: 2019-01-23 12:15
 */
public class OptionDialogTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            JFrame optionDialogFrame = new OptionDialogFrame();
            optionDialogFrame.setTitle("textText");
            optionDialogFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            optionDialogFrame.setVisible(true);

        });
    }

}
