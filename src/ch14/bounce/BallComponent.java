package ch14.bounce;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * @program: Core_Java
 * @description: BallComponent
 * @author: Jun Wang
 * @create: 2019-01-02 11:03
 */
public class BallComponent extends JPanel {

    private static final int DEFAULT_WIDTH = 450;
    private static final int DEFAULT_HEIGHT = 450;

    private java.util.List<Ball> balls = new ArrayList<>();

    public void add(Ball b){
        balls.add(b);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        for (Ball ball : balls) {
            g2.fill(ball.getShape());
        }
    }

    public Dimension getPreferredSize () {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
