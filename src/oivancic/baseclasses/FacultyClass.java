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
public class FacultyClass extends OfferedClass
{
    private ArrayList<Student> students = new ArrayList<>();
    
    public FacultyClass()
    {
        super();
    }

    public FacultyClass(float classIdNumber, String className, Classroom room) 
    {
        super(classIdNumber, className, room);
    }

    public ArrayList<Student> getStudents() 
    {
        return students;
    }

    public void setStudents(ArrayList<Student> students) 
    {
        this.students = students;
    }

    @Override
    public String toString() 
    {
        return super.getClassName() + " "
                + "(students: " + students.toString() + ")";
    }
    
    public Student getStudent(int index)
    {
        Student aStudent = students.get(index);
        return aStudent;
    }
    
    public void addStudent(Student aStudent)
    {
        students.add(aStudent);
    }
}
