package app;

public class Main {
    static Logger logger = Logger.getInstance();

    public static void main(String[] args) {
        logger.log("Log message 1");
        logger.log("Log message 2");


        logger.getLogs();
    }
}
