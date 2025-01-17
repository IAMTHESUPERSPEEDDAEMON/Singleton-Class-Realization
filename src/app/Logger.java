package app;

import java.util.*;

public class Logger {
    private static Logger instance;
    private final List<String> logEntries;

    private Logger() {
        logEntries = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logEntries.add(message);
        System.out.println("[LOG]: " + message);
    }

    public List<String> getLogs() {
        return new ArrayList<>(logEntries);
    }
}
