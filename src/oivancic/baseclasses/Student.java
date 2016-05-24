/**
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
public class Student extends Person
{
    private GregorianCalendar dateOfGraduation;
    private float currentGPA;
    private ArrayList<StudentClass> classes = new ArrayList<StudentClass>();
    
    public Student()
    {
        super();
        this.dateOfGraduation = new GregorianCalendar();
        this.currentGPA = 0f;
    }

    public Student(GregorianCalendar dateOfGraduation, float currentGPA, 
            String name, String address, String socialSecurityNumber, 
            GregorianCalendar dateOfBirth)
    {
        super(name, address, socialSecurityNumber, dateOfBirth);
        this.dateOfGraduation = dateOfGraduation;
        this.currentGPA = currentGPA;
    }

    /**
     * Setting Date of Graduation using an existing date
     */
    public void setDateOfGraduation(GregorianCalendar dateOfGraduation) 
    {
        this.dateOfGraduation = dateOfGraduation;
    }
    
    /** 
     * Setting Date of Graduation using integers as month, day and year parameters
     */
    public void setDateOfGraduation(int year, int month, int day)
    {
        this.dateOfGraduation = new GregorianCalendar(year, month, day);
    }

    public void setCurrentGPA(float currentGPA) 
    {
        this.currentGPA = currentGPA;
    }

    /**
     *
     * @param classes
     */
    public void setClasses(ArrayList<StudentClass> classes) 
    {
        this.classes = classes;
    }

    public GregorianCalendar getDateOfGraduation() 
    {
        return dateOfGraduation;
    }
    
    public float getCurrentGPA() 
    {
        return currentGPA;
    }

    public ArrayList<StudentClass> getClasses() 
    {
        return classes;
    }

    /**
     * This method calculates the GPA but does not set it. Call setCurrentGPA 
     * method to set the GPA
     */
    public float calculateGPA() 
    {
        float averageGrade = 0.0f;
        int i = 0,j = 0;
        
        // Loop through the arraylist of classes
        // For each class, loop through the arraylist of grades   
        
        // class loop, index on i
        for (i= 0; i < classes.size(); i++)
        {
            // get the list of grades for class(i)
            ArrayList listOfGradesForAClass = classes.get(i).getGrades();
            
            // grades loop, index on j
            for (j = 0; j < listOfGradesForAClass.size(); j++) 
            {
                Float aGrade = (Float) listOfGradesForAClass.get(j);
                averageGrade = averageGrade + aGrade;
            }           
        }
        // get the averageGrade grade based on all the grades for the student
        currentGPA = averageGrade / (i*j);  
        
        // return the averageGrade grade converted to a gpa scale of 0-4.
        return currentGPA/25;
    }
    
    @Override
    public String toString() {
        return super.getName();
    }
    
}
