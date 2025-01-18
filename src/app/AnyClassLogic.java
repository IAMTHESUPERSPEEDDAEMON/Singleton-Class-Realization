package app;

public class AnyClassLogic {
    static Logger logger = Logger.getInstance();

    public void start(int number) {
        if (number == 1) {
            logger.log("We have number one");
            stop();
        } else {
            logger.log("We have other number");
            stop();
        }
    }

    private void stop() {
        logger.log("Program finished");
    }
}
