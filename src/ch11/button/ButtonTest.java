package ch11.button;

import javax.swing.*;
import java.awt.*;

public class ButtonTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
            {
                JFrame frame = new ButtonFrame();
                frame.setTitle("ButtonTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        );
    }
}
