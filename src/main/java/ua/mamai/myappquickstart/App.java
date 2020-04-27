package ua.mamai.myappquickstart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

    private final static Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args ) {

        logger.info("This is   info");
        logger.warn("This is   warn");
        logger.error("This is   error");
        logger.fatal("This is   fatal");

    }
}
