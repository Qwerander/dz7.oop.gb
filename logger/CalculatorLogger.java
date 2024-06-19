package logger;

import java.util.logging.Logger;

public class CalculatorLogger {
    private static final Logger logger = Logger.getLogger(CalculatorLogger.class.getName());

    public static void log(String message) {
        logger.info(message);
    }
}
