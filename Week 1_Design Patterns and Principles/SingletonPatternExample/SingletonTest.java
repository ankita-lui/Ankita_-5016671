package SingletonPatternExample;

public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Test if both references point to the same object
        System.out.println("Are logger1 and logger2 the same instance? " + (logger1 == logger2));

        // Use the logger
        logger1.log("This is a log message from logger1");
        logger2.log("This is a log message from logger2");
    }
}
