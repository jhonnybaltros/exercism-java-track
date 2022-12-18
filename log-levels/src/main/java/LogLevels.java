public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(':') +1).trim();
    }

    public static String logLevel(String logLine) {
        int firstBracket = logLine.indexOf('[');
        int secondBracket = logLine.indexOf(']');

        return logLine.substring(firstBracket + 1, secondBracket).toLowerCase();
    }

    public static String reformat(String logLine) {
        return LogLevels.message(logLine) + " "+ "("+LogLevels.logLevel(logLine) + ")";
    }
}
