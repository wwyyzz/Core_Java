package ch11.action;

import javax.swing.*;
import java.awt.*;

public class ActionTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
                {
                    JFrame frame = new ActionFrame();
                    frame.setTitle("ActionTest");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }

}
