package app;

public class Main {
    static Logger logger = Logger.getInstance();

    public static void main(String[] args) {
        AnyClassLogic anyClassLogic = new AnyClassLogic();
        anyClassLogic.start(1);


        logger.getLogs();
    }
}
