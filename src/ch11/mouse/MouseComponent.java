package ch11.mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class MouseComponent extends JComponent {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    public static final int SIDELENGTH = 10;
    private ArrayList<Rectangle2D> squares;
    private Rectangle2D current;

    public MouseComponent()
    {
        squares = new ArrayList<>();
        current = null;

        addMouseListener(new MouseHandle());
        addMouseMotionListener(new MouseMotionHandle());
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;

        for (Rectangle2D r:squares
             ) {
            g2.draw(r);
        }
    }

    public Rectangle2D find (Point2D p)
    {
        for (Rectangle2D r:squares
             ) {
            if (r.contains(p)) return r;
        }
        return null;
    }

    public void add(Point2D p)
    {
        double x = p.getX();
        double y = p.getY();

        current = new Rectangle2D.Double(x - SIDELENGTH / 2 , y - SIDELENGTH / 2, SIDELENGTH,SIDELENGTH);
        squares.add(current);
        System.out.println(squares.size());
        repaint();
    }

    public void remove(Rectangle2D s)
    {
        if (s == null ) return;
        if (s == current) current = null;
        squares.remove(s);
        repaint();
    }

    private class MouseHandle extends MouseAdapter
    {
        public void mousePressed(MouseEvent event)
        {
            current = find(event.getPoint());
            if (current == null) add(event.getPoint());
        }

        public void mouseClicked(MouseEvent event)
        {
            current = find(event.getPoint());
            if (current != null && event.getClickCount() >= 2) remove(current);
        }
    }

    private class MouseMotionHandle implements MouseMotionListener
    {

        @Override
        public void mouseDragged(MouseEvent e) {
            if (find(e.getPoint()) == null) setCursor(Cursor.getDefaultCursor());
            else
            {
                setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            if (current != null)
            {
                int x = e.getX();
                int y = e.getY();

                current.setFrame(x - SIDELENGTH / 2, y - SIDELENGTH /2, SIDELENGTH,SIDELENGTH);
                repaint();
            }
        }
    }
}