/*
 * Course 90.301
 * Assignment #3
 * Last modified: 02/10/2015
 */

package oivancic.baseclasses;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Olga Ivancic
 */
public class Faculty extends Person
{
    private GregorianCalendar dateOfHire;
    private GregorianCalendar dateOfTermination;
    private double salary;
    private char status;  // 'p' - part time, 'f' - full time
    private ArrayList<FacultyClass> classes = new ArrayList<FacultyClass>();
    
    public Faculty()
    {
        super();
        this.dateOfHire = new GregorianCalendar();
        this.dateOfTermination = new GregorianCalendar();
        this.salary = 0.0;
        this.status = 'f';
    }

    public Faculty(GregorianCalendar dateOfHire, GregorianCalendar dateOfTermination, 
            double salary, char status, String name, String address, 
            String socialSecurityNumber, GregorianCalendar dateOfBirth) 
    {
        super(name, address, socialSecurityNumber, dateOfBirth);
        this.dateOfHire = dateOfHire;
        this.dateOfTermination = dateOfTermination;
        this.salary = salary;
        this.status = status;
    }

    /**
     * Setting Date of Hire using an existing date
     */
    public void setDateOfHire(GregorianCalendar dateOfHire) 
    {
        this.dateOfHire = dateOfHire;
    }
    
    /** 
     * Setting Date of Hire using integers as month, day and year parameters
     */
    public void setDateOfHire(int year, int month, int day)
    {
        this.dateOfHire = new GregorianCalendar(year, month, day);
    }
    
    /**
     * Setting Date of Termination using an existing date
     */
    public void setDateOfTermination(GregorianCalendar dateOfTermination) 
    {
        this.dateOfTermination = dateOfTermination;
    }
    
    /** 
     * Setting Date of Termination using integers as month, day and year parameters
     */
    public void setDateOfTermination(int year, int month, int day)
    {
        this.dateOfTermination = new GregorianCalendar(year, month, day);
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }

    public void setStatus(char status) 
    {
        this.status = status;
    }

    public void setClasses(ArrayList<FacultyClass> classes) 
    {
        this.classes = classes;
    }

    public GregorianCalendar getDateOfHire() 
    {
        return dateOfHire;
    }

    public GregorianCalendar getDateOfTermination() 
    {
        return dateOfTermination;
    }

    public double getSalary() 
    {
        return salary;
    }

    public char getStatus() 
    {
        return status;
    }

    public ArrayList<FacultyClass> getClasses() 
    {
        return classes;
    }
    
    public void addClass(FacultyClass object)
    {
        classes.add(object);
    }

    @Override
    public String toString() 
    {
        return super.toString() + "\nDate Of Hire: " + dateOfHire.getTime() + "\n"
                + "Date Of Termination: " + dateOfTermination.getTime() + 
                "\nSalary: " + salary + "\nStatus ('p' - part time, 'f' - full "
                + "time): " + status + "\nClasses: " + classes.toString();
    }
    
}


