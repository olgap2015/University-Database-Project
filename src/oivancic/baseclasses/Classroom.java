/*
 * Course 90.301
 * Assignment #3
 * Last modified: 02/10/2015
 */

package oivancic.baseclasses;

/**
 *
 * @author Olga Ivancic
 */
public class Classroom 
{
    private String roomNumber;
    private char status;    // 'l' - lab, 'c' - classroom, 'h' - lecture hall
    
    public Classroom()
    {
        this.roomNumber = "";
        this.status = 'c';
    }

    public Classroom(String roomNumber, char status) 
    {
        this.roomNumber = roomNumber;
        this.status = status;
    }

    public void setRoomNumber(String roomNumber) 
    {
        this.roomNumber = roomNumber;
    }

    public void setStatus(char status) 
    {
        this.status = status;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public char getStatus() {
        return status;
    }

    @Override
    public String toString() 
    {
        String formattedStatus;
        
        if (status == 'L')
            formattedStatus = "Lab";
        else if (status == 'C')
            formattedStatus = "Classroom";
        else
            formattedStatus = "Lecture Hall";
        
        return formattedStatus + " #" + roomNumber;
    }
    
}
