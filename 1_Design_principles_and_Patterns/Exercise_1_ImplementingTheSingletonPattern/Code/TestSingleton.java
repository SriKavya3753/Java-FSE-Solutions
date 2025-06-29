class Logger {
    // Private static instance of the Logger class
    private static Logger instance;

    // Private constructor to restrict instantiation
    private Logger() {
        System.out.println("Logger instance created");
    }

    // Public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            // Create a new instance if it doesn't already exist
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

public class TestSingleton {
    public static void main(String[] args) {
        // Attempt to create two instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Verify that both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }

        // Test the logging functionality
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");
    }
}
