/*
 * Course 90.301
 * Assignment #4-5
 * Last modified: 03/19/2015
 */

package oivancic.view.reports;

import static java.lang.String.valueOf;
import java.util.ArrayList;
import oivancic.baseclasses.Student;
import oivancic.data.DataContainer;
import static oivancic.utilities.DateFormatter.getFormattedDate;

/**
 *
 * @author Olga Ivancic
 */
public class ListAllStudentsWindow extends javax.swing.JFrame {
    
    DataContainer datacontainer; // local copy of the datacontainer that holds all the data
    
    /**
     * Creates new form ListAllStudentsWindow
     */
    public ListAllStudentsWindow(DataContainer datacontainer) {
        initComponents();
        this.datacontainer = datacontainer;
        
        // Create the header of the "table" for the text area
        String studentsReportText = "Name\tAddress\tSSN\tDate of Birth\tDate of Graduation\tClasses Taken\t\tGPA\n";
        
        // Get a list of students from the datacontainer
        ArrayList<Student> listOfStudents = this.datacontainer.getListOfStudents();
        
        // Loop through the List of Students to add data to the studentsReportText
        for (int i = 0; i < listOfStudents.size(); i++) {
            Student aStudent = listOfStudents.get(i);
            String name = aStudent.getName();
            String address = aStudent.getAddress();
            String ssn = aStudent.getSocialSecurityNumber();
            String dob = getFormattedDate(aStudent.getDateOfBirth());
            String dateOfGraduation = getFormattedDate(aStudent.getDateOfGraduation());
            String classes = aStudent.getClasses().toString();
            String GPA = valueOf(aStudent.getCurrentGPA());
            
            studentsReportText += name;
            studentsReportText += "\t";
            studentsReportText += address;
            studentsReportText += "\t";
            studentsReportText += ssn;
            studentsReportText += "\t";
            studentsReportText += dob;
            studentsReportText += "\t";
            studentsReportText += dateOfGraduation;
            studentsReportText += "\t";
            studentsReportText += classes;
            studentsReportText += "\t";
            studentsReportText += GPA;
            studentsReportText += "\n";
        }
        
        // Set text for the textarea
        this.listAllStudentsTextArea.setText(studentsReportText);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listStudentsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAllStudentsTextArea = new javax.swing.JTextArea();
        closeListAllStudentsWindowButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listStudentsLabel.setText("List of All Students");

        listAllStudentsTextArea.setEditable(false);
        listAllStudentsTextArea.setColumns(20);
        listAllStudentsTextArea.setRows(5);
        jScrollPane1.setViewportView(listAllStudentsTextArea);

        closeListAllStudentsWindowButton.setText("Close");
        closeListAllStudentsWindowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeListAllStudentsWindowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(listStudentsLabel)
                        .addGap(329, 329, 329))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(closeListAllStudentsWindowButton)
                        .addGap(335, 335, 335))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listStudentsLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closeListAllStudentsWindowButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeListAllStudentsWindowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeListAllStudentsWindowButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeListAllStudentsWindowButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeListAllStudentsWindowButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listAllStudentsTextArea;
    private javax.swing.JLabel listStudentsLabel;
    // End of variables declaration//GEN-END:variables
}