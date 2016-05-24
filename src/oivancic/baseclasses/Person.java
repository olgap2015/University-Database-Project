/*
 * Course 90.301
 * Assignment #3
 * Last modified: 02/10/2015
 */

package oivancic.baseclasses;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author Olga Ivancic
 */
public abstract class Person 
{
    private String name;
    private String address;
    private String socialSecurityNumber;
    private GregorianCalendar dateOfBirth;
    
    // Create a date formatter
    protected SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    
    protected Person()
    {
        this.name = "";
        this.address = "";
        this.socialSecurityNumber = "";
        this.dateOfBirth = new GregorianCalendar();
    }
    
    protected Person(String name, String address, String socialSecurityNumber, 
            GregorianCalendar dateOfBirth) 
    {
        this.name = name;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) 
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    // setting Date of Birth using an existing date
    public void setDateOfBirth(GregorianCalendar dateOfBirth) 
    {
        this.dateOfBirth = dateOfBirth;
    }
    
    // setting Date of Birth using integers as month, day and year parameters
    public void setDateOfBirth(int year, int month, int day)
    {
        this.dateOfBirth = new GregorianCalendar(year, month, day);
    }
    
    public String getName() 
    {
        return name;
    }

    public String getAddress() 
    {
        return address;
    }

    public String getSocialSecurityNumber() 
    {
        return socialSecurityNumber;
    }

    public GregorianCalendar getDateOfBirth() 
    {
        return dateOfBirth;
    }

    @Override
    public String toString() 
    {
        return "Name: " + name + "\nAddress: " + address + "\nSocial Security "
                + "Number: " + socialSecurityNumber + "\nDate of Birth:"
                + " " + dateOfBirth.getTime();
    }
 
}
