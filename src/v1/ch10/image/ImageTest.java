package v1.ch10.image;

import javax.swing.*;
import java.awt.*;

public class ImageTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
                {
                    JFrame frame = new ImageFrame();
                    frame.setTitle("FontTest");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }
}


class ImageFrame extends JFrame
{
    public ImageFrame()
    {
        add(new ImageComponent());
        pack();
    }
}

class ImageComponent extends JComponent
{
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    private Image image;

    public ImageComponent()
    {
        image = new ImageIcon("src/v1.ch10/image/blue-ball.gif").getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (image == null) return;

        int imageWidth = image.getWidth((this));
        int imageHeight = image.getHeight((this));

        g.drawImage(image, 0, 0, null);

        for (int i = 0; i * imageWidth <= getWidth()  ; i++) {
            for (int j = 0; j * imageHeight <= getHeight() ; j++) {
                if (i + j > 0)
                {
                    g.copyArea(0, 0, imageWidth, imageHeight, i * imageWidth, j * imageHeight);
                }

            }

        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}