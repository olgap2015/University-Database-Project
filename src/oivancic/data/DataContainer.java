/**
 * Course 90.301
 * Assignment #5
 * Last modified: 03/03/2015
 */
package oivancic.data;

import java.util.ArrayList;
import oivancic.baseclasses.Classroom;
import oivancic.baseclasses.Faculty;
import oivancic.baseclasses.OfferedClass;
import oivancic.baseclasses.Student;

/**
 *
 * @author Olga Ivancic
 * 
 * DataContainer Class is creating master array lists to hold all the data
 * that the user will input via UI.
 */
public class DataContainer 
{
    private ArrayList<Classroom> listOfClassrooms = new ArrayList<Classroom>();
    private ArrayList<Student> listOfStudents = new ArrayList<Student>();
    private ArrayList<Faculty> listOfFaculty = new ArrayList<Faculty>();
    private ArrayList<OfferedClass> listOfClasses = new ArrayList<OfferedClass>();

    public ArrayList<Classroom> getListOfClassrooms() {
        return listOfClassrooms;
    }

    public void setListOfClassrooms(ArrayList<Classroom> listOfClassrooms) {
        this.listOfClassrooms = listOfClassrooms;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public ArrayList<Faculty> getListOfFaculty() {
        return listOfFaculty;
    }

    public void setListOfFaculty(ArrayList<Faculty> listOfFaculty) {
        this.listOfFaculty = listOfFaculty;
    }

    public ArrayList<OfferedClass> getListOfClasses() {
        return listOfClasses;
    }

    public void setListOfClasses(ArrayList<OfferedClass> listOfClasses) {
        this.listOfClasses = listOfClasses;
    }
    
}
