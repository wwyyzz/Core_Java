package ch11.plaf;

import javax.swing.*;
import java.awt.*;

public class PlafTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
                {
                    JFrame frame = new PlafFrame();
                    frame.setTitle("ButtonTest");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }
}
