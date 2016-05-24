/**
 * Course 90.301
 * Assignment #5
 * Last modified: 03/19/2015
 */
package oivancic.utilities;


import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * This class is to be used to convert the date from GregorianCalendat type to
 * String type in the MM/dd/yyyy format for outputting the dates in the reports.
 * @author Olga Ivancic
 */
public class DateFormatter {
    
    public static SimpleDateFormat formattedDate = new SimpleDateFormat("MM/dd/yyyy");
    
    /**
     * Formats the GregorianCalendar type date into a String format MM/dd/yyyy.
     * @param date
     * @return String date of MM/dd/yyyy format
     */
    public static String getFormattedDate(GregorianCalendar date) {
        
        return formattedDate.format(date.getTime());
    }
}
