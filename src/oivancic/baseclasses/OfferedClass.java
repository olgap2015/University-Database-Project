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
public class OfferedClass 
{
    private Classroom room;
    private String className;
    private float classIdNumber;
    
    public OfferedClass()
    {
        this.room = new Classroom();
        this.className = "";
        this.classIdNumber = 0f;
    }

    public OfferedClass(float classIdNumber, String className, Classroom room) 
    {
        this.room = room;
        this.className = className;
        this.classIdNumber = classIdNumber;
    }

    public Classroom getClassroom() 
    {
        return room;
    }

    public void setClassroom(Classroom room) 
    {
        this.room = room;
    }

    public String getClassName() 
    {
        return className;
    }

    public void setClassName(String className) 
    {
        this.className = className;
    }

    public float getClassIdNumber() 
    {
        return classIdNumber;
    }

    public void setClassIdNumber(float classIdNumber) 
    {
        this.classIdNumber = classIdNumber;
    }
    
    @Override
    public String toString() 
    {
        return "Room: " + room + "\nClass Name: " + className + "\nClass Id "
                + "Number: " + classIdNumber;
    }
    
    
}
