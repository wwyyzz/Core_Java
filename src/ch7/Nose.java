package ch7;

import java.util.logging.*;

public class Nose{
    // Obtain a suitable logger.
    private static Logger logger = Logger.getLogger("com.wombat.nose");
    public static void main(String argv[]) {
        System.out.println("logg");
        logger.log(Level.WARNING, "hi");
        // Log a FINE tracing message
        logger.fine("doing stuff");
        try{
//            Wombat.sneeze();
        } catch (Exception ex) {
            // Log the exception
            logger.log(Level.WARNING, "trouble sneezing", ex);
        }
        logger.fine("done");
    }
}
