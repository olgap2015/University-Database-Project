/*
 * Course 90.301
 * Assignment #2
 * Last modified: 02/02/2015
 */

package oivancic.utilities;

/**
 *
 * @author Olga Ivancic
 * 
 * Logger Class is responsible for logging information regarding the performance
 * of the application. Four different levels of logging are available: debug, 
 * info, warning, and error. The amount of logged information decreases from 
 * debug to error levels. the Class also allows to turn logging on and off.
 */
public class Logger {
    
    private static boolean loggingIsOn = true; // enables logging if "true"
    private static int loggingLevel; // determines logging detail level, 1-4
    
    public static void setLogLevel(int logLevel) {
    
        loggingLevel = logLevel;
    }
    
    /**
     * Enables logging
     */
    public static void enableLogging() {
        
        loggingIsOn = true;
    }
    
    /**
     * Disables logging
     */
    public static void disableLogging() {
        
        loggingIsOn = false;
    }
    
    /**
     * Prints DEBUGGING information to the console. Method is activated when
     * loggingLevel is set for 4.
     * @param strMessage - debugging message to output to the console, String
     */
    public static void logDebug(String strMessage) {
        
        if (loggingIsOn == true && loggingLevel == 4)
            System.out.println("DEBUG: " + strMessage);
    }
    
    /**
     * Prints INFORNATIVE message to the console. Method is activated when
     * loggingLevel is set for 3-4.
     * @param strMessage - informative message to output to the console, String
     */
    public static void logInfo(String strMessage) {
        
        if (loggingIsOn == true && (loggingLevel == 4 || loggingLevel == 3))
            System.out.println("INFO: " + strMessage);
    }
    
    /**
     * Prints WARNING message to the console. Method is activated when
     * loggingLevel is set for 2-4.
     * @param strMessage - warning message to output to the console, String
     */
    public static void logWarning(String strMessage) {
        
        if (loggingIsOn == true)
        {
            if (loggingLevel == 4)
                System.out.println("WARNING: " + strMessage);
            else if (loggingLevel == 3)
                System.out.println("WARNING: " + strMessage);
            else if (loggingLevel == 2)
                System.out.println("WARNING: " + strMessage);
        }
    }
    
    /**
     * Prints ERROR message to the console. Method is activated when
     * loggingLevel is set for 1-4.
     * @param strMessage - error message to output to the console, String
     */
    public static void logError(String strMessage) {
        
        if (loggingIsOn == true)
        {
            if (loggingLevel == 4)
                System.out.println("ERROR: " + strMessage);
            else if (loggingLevel == 3)
                System.out.println("ERROR: " + strMessage);
            else if (loggingLevel == 2)
                System.out.println("ERROR: " + strMessage);
            else if (loggingLevel == 1)
            System.out.println("ERROR: " + strMessage);
        }
    }
}
