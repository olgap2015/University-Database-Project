/*
 * Course 90.301
 * Assignment #4-5
 * Last modified: 03/05/2015
 */

package oivancic.view.applicationmain;

/**
 *
 * @author Olga
 */
public class HelpWindow extends javax.swing.JFrame {

    /**
     * Creates new form HelpWindow
     */
    public HelpWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        helpTextArea = new javax.swing.JTextArea();
        closeHelpWindowButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        helpTextArea.setEditable(false);
        helpTextArea.setColumns(20);
        helpTextArea.setRows(5);
        helpTextArea.setText("Welcome to the University Student/Faculty Database!\n\nUsing the program you can add, store and display information about students and faculty staff.\n\nLets go through the Main Menu options:\n1. Students->Add Students - fill in the form and add a student to the database\n2. Students->List All Students - displays a report containing a current list of all students\n3. Faculty->Add Faculty - fill in the form and add a member of the faculty staff to the database\n4. Faculty->List All Faculty - displays a report containing a current list of faculty staff \n5. Classrooms->Add Classrooms - fill in the form and add a classroom to the database\n6. Classrooms->List All Classrooms - displays a report containing a current list of all classrooms\n7. Classes->Add Classes - fill in the form and add an offered class to the database\n8. Classes->List All Classes - displays a report containing a current list of all offered classes");
        jScrollPane1.setViewportView(helpTextArea);

        closeHelpWindowButton.setText("Close");
        closeHelpWindowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeHelpWindowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeHelpWindowButton)
                .addGap(376, 376, 376))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closeHelpWindowButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeHelpWindowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeHelpWindowButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeHelpWindowButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeHelpWindowButton;
    private javax.swing.JTextArea helpTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
