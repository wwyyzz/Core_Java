package v1.ch6.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import static v1.ch6.innerClass.TalkingClock.*;

/**
 * @program: Core_Java
 * @description: innerClass
 * @author: Jun Wang
 * @create: 2019-01-16 11:34
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock3 clock = new TalkingClock3(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit program");
        System.exit(0);


    }
}

class TalkingClock
{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start()
    {
        ActionListener listener = new TimerPrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public class TimerPrinter implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is " + new Date());
            if (beep)
            {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}

//内部类放在方法中
class TalkingClock2
{
    private int interval;
    private boolean beep;

    public TalkingClock2(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start()
    {
        //内部类放在方法中
        class TimerPrinter implements ActionListener
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is " + new Date());
                if (beep)
                {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener listener = new TimerPrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

}


class TalkingClock3
{
    private int interval;
    private boolean beep;

    public TalkingClock3(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start()
    {

//        匿名内部类
        ActionListener listener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is " + new Date());
                if (beep)
                {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();
    }

}