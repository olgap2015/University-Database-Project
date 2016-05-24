/*
 * Course 90.301
 * Assignment #4-5
 * Last modified: 03/18/2015
 */

package oivancic.view.reports;

import java.util.ArrayList;
import oivancic.baseclasses.Classroom;
import oivancic.data.DataContainer;

/**
 *
 * @author Olga Ivancic
 */
public class ListAllClassroomsWindow extends javax.swing.JFrame {

    DataContainer datacontainer; // local copy of the datacontainer that holds all the data
    
    /**
     * Creates new form ListAllClassroomsWindow
     */
    public ListAllClassroomsWindow(DataContainer datacontainer) {
        initComponents();
        this.datacontainer = datacontainer;
        
        // Create the header of the "table" for the text area
        String classroomsReportText = "Room Number\tRoom Type\n";
        
        // Get a list of classrooms from the datacontainer
        ArrayList<Classroom> listOfClassrooms = this.datacontainer.getListOfClassrooms();
        
        // Loop through the List of Classrooms to add data to the classroomsReportText
        for (int i = 0; i < listOfClassrooms.size(); i++) {
            Classroom aClassroom = listOfClassrooms.get(i);
            String roomNumber = aClassroom.getRoomNumber();
            char charRoomType = aClassroom.getStatus();
            String roomType;
            
            if (charRoomType == 'L')
                roomType = "Lab";
            else if (charRoomType == 'C')
                roomType = "Classroom";
            else
                roomType = "Lecture Hall";
            classroomsReportText += roomNumber;
            classroomsReportText += "\t";
            classroomsReportText += roomType;
            classroomsReportText += "\n";
        }
        
        // Set text for the textarea
        this.listOfClassroomsTextArea.setText(classroomsReportText);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listAllClassroomsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOfClassroomsTextArea = new javax.swing.JTextArea();
        closeListAllClassroomsWindowButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listAllClassroomsLabel.setText("List of All Classrooms");

        listOfClassroomsTextArea.setEditable(false);
        listOfClassroomsTextArea.setColumns(20);
        listOfClassroomsTextArea.setRows(5);
        jScrollPane1.setViewportView(listOfClassroomsTextArea);

        closeListAllClassroomsWindowButton.setText("Close");
        closeListAllClassroomsWindowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeListAllClassroomsWindowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(listAllClassroomsLabel)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(closeListAllClassroomsWindowButton)
                        .addGap(225, 225, 225))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listAllClassroomsLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(closeListAllClassroomsWindowButton)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeListAllClassroomsWindowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeListAllClassroomsWindowButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeListAllClassroomsWindowButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeListAllClassroomsWindowButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listAllClassroomsLabel;
    private javax.swing.JTextArea listOfClassroomsTextArea;
    // End of variables declaration//GEN-END:variables
}