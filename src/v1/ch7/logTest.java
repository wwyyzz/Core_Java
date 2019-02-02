package v1.ch7;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class logTest {

    private final static Logger mylogger = Logger.getLogger("com.wj.logTest");

    public static void main(String[] args) {

        System.out.println("hello world");

        mylogger.info("this is info log");

        mylogger.setLevel(Level.FINE);

        System.out.println("name :" + mylogger.getName());

        System.out.println("level :" + mylogger.getLevel());

        mylogger.fine("this is fine log");


    }
}
