/*
 * Course 90.301
 * Assignment #3
 * Last modified: 02/10/2015
 */

package oivancic.baseclasses;

import static java.lang.String.valueOf;
import java.util.ArrayList;

/**
 *
 * @author Olga Ivancic
 */
public class StudentClass extends OfferedClass
{
    private ArrayList<Float> grades = new ArrayList<>();
    
    public StudentClass()
    {
        super();
    }

    public StudentClass(float classIdNumber, String className, Classroom room) 
    {
        super(classIdNumber, className, room);
    }

    public ArrayList<Float> getGrades() 
    {
        return grades;
    }

    public void setGrades(ArrayList<Float> grades) 
    {
        this.grades = grades;
    }

    @Override
    public String toString() 
    {
        return valueOf(super.getClassIdNumber()) + " - " + super.getClassName() + " (grades: " + grades + ")";
    }
    
    // getGrade– retrieve a single grade based on an index into the array
        
    public float getGrade(int index)
    {
        float singleGrade = grades.get(index);
        return singleGrade;
    }
    
    // add a grade to the list of grades
    public void addGrade(float singleGrade)
    {
        grades.add(singleGrade);
    }
}
