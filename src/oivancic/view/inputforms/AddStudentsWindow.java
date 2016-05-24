/*
 * Course 90.301
 * Assignment #4-5
 * Last modified: 03/16/2015
 */

package oivancic.view.inputforms;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import oivancic.baseclasses.OfferedClass;
import oivancic.baseclasses.Student;
import oivancic.baseclasses.StudentClass;
import oivancic.data.DataContainer;

/**
 *
 * @author Olga Ivancic
 */
public class AddStudentsWindow extends javax.swing.JFrame {

    DataContainer datacontainer; // local copy of the data container for storing Student data
    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    private Student aStudent = new Student(); // creating a new Student object to save the data from the form
    
    /**
     * Creates new form AddStudents
     */
    public AddStudentsWindow(DataContainer datacontainer) {
        initComponents();
        this.datacontainer = datacontainer;
        
        // Create the content of the Select Classes combo box by adding elements
        // from the List of Classes Array List from the datacontainer
        ArrayList<OfferedClass> offeredClasses = this.datacontainer.getListOfClasses();
        for (OfferedClass offeredClass : offeredClasses) {
            comboBoxModel.addElement(offeredClass.getClassName());
        }
        
        // Set the combo box model
        this.selectClassesComboBox.setModel(comboBoxModel);
    }
    
    /**
     * Empties all the fields on the form
     */
    private void clearAllFields() {
        
        this.selectClassesComboBox.setSelectedIndex(0);
        this.studentAddressField.setText("");
        this.studentDayOfBirthField.setText("dd");
        this.studentDayOfGraduationField.setText("dd");
        this.studentMonthOfBirthField.setText("mm");
        this.studentMonthOfGraduationField.setText("mm");
        this.studentNameField.setText("");
        this.studentSocialSecurityNumberField.setText("");
        this.studentYearOfBirthField.setText("yyyy");
        this.studentYearOfGraduationField.setText("yyyy");
        this.typeInGradesField.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveStudentButton = new javax.swing.JButton();
        clearStudentButton = new javax.swing.JButton();
        closeStudentButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        studentDateOfGraduationLabel = new javax.swing.JLabel();
        studentNameField = new javax.swing.JTextField();
        studentDayOfBirthField = new javax.swing.JTextField();
        studentNameLabel = new javax.swing.JLabel();
        studentMonthOfBirthField = new javax.swing.JTextField();
        studentYearOfBirthField = new javax.swing.JTextField();
        studentDayOfGraduationField = new javax.swing.JTextField();
        studentMonthOfGraduationField = new javax.swing.JTextField();
        studentSocialSecurityNumberLabel = new javax.swing.JLabel();
        studentAddressLabel = new javax.swing.JLabel();
        studentAddressField = new javax.swing.JTextField();
        studentSocialSecurityNumberField = new javax.swing.JTextField();
        studentDateOfBirthLabel = new javax.swing.JLabel();
        studentYearOfGraduationField = new javax.swing.JTextField();
        addClassesPanel = new javax.swing.JPanel();
        selectClassesComboBox = new javax.swing.JComboBox();
        addClassButton = new javax.swing.JButton();
        typeInGradesField = new javax.swing.JTextField();
        selectClassesLabel = new javax.swing.JLabel();
        typeInGragesLabel = new javax.swing.JLabel();
        addStudentsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saveStudentButton.setText("Save");
        saveStudentButton.setEnabled(false);
        saveStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveStudentButtonActionPerformed(evt);
            }
        });

        clearStudentButton.setText("Clear");
        clearStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearStudentButtonActionPerformed(evt);
            }
        });

        closeStudentButton.setText("Close");
        closeStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeStudentButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        studentDateOfGraduationLabel.setText("Date Of Graduation:");

        studentNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameFieldActionPerformed(evt);
            }
        });

        studentDayOfBirthField.setText("dd");
        studentDayOfBirthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDayOfBirthFieldActionPerformed(evt);
            }
        });

        studentNameLabel.setText("Name:");

        studentMonthOfBirthField.setText("mm");
        studentMonthOfBirthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentMonthOfBirthFieldActionPerformed(evt);
            }
        });

        studentYearOfBirthField.setText("yyyy");
        studentYearOfBirthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentYearOfBirthFieldActionPerformed(evt);
            }
        });

        studentDayOfGraduationField.setText("dd");
        studentDayOfGraduationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDayOfGraduationFieldActionPerformed(evt);
            }
        });

        studentMonthOfGraduationField.setText("mm");
        studentMonthOfGraduationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentMonthOfGraduationFieldActionPerformed(evt);
            }
        });

        studentSocialSecurityNumberLabel.setText("Social Security Number:");

        studentAddressLabel.setText("Address:");

        studentAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAddressFieldActionPerformed(evt);
            }
        });

        studentSocialSecurityNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSocialSecurityNumberFieldActionPerformed(evt);
            }
        });

        studentDateOfBirthLabel.setText("Date Of Birth:");

        studentYearOfGraduationField.setText("yyyy");
        studentYearOfGraduationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentYearOfGraduationFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentNameLabel)
                    .addComponent(studentAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentSocialSecurityNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(studentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(studentAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(studentSocialSecurityNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentDateOfBirthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentDateOfGraduationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(studentMonthOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentDayOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(studentMonthOfGraduationField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentDayOfGraduationField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(studentYearOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentYearOfGraduationField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(studentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(studentAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(studentMonthOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(studentDayOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(studentMonthOfGraduationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(studentDayOfGraduationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(studentYearOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(studentYearOfGraduationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(studentDateOfBirthLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(studentDateOfGraduationLabel))))
                        .addGap(9, 9, 9)
                        .addComponent(studentSocialSecurityNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(studentNameLabel)
                        .addGap(16, 16, 16)
                        .addComponent(studentAddressLabel)
                        .addGap(16, 16, 16)
                        .addComponent(studentSocialSecurityNumberLabel)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        addClassesPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        addClassButton.setText("Add Class");
        addClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassButtonActionPerformed(evt);
            }
        });

        selectClassesLabel.setText("Select a class from the list of Offered Classes:");

        typeInGragesLabel.setText("Type in grades for the above selected class separated by the comma:");

        javax.swing.GroupLayout addClassesPanelLayout = new javax.swing.GroupLayout(addClassesPanel);
        addClassesPanel.setLayout(addClassesPanelLayout);
        addClassesPanelLayout.setHorizontalGroup(
            addClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addClassesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectClassesLabel)
                    .addComponent(typeInGragesLabel))
                .addGap(38, 38, 38)
                .addGroup(addClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeInGradesField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectClassesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
            .addGroup(addClassesPanelLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(addClassButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addClassesPanelLayout.setVerticalGroup(
            addClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addClassesPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectClassesLabel)
                    .addComponent(selectClassesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addClassesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeInGradesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeInGragesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(addClassButton)
                .addGap(26, 26, 26))
        );

        addStudentsLabel.setText("Add Students");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(addStudentsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveStudentButton)
                        .addGap(35, 35, 35)
                        .addComponent(clearStudentButton)
                        .addGap(42, 42, 42)
                        .addComponent(closeStudentButton)
                        .addGap(237, 237, 237))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addClassesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 49, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addStudentsLabel)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(addClassesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveStudentButton)
                    .addComponent(clearStudentButton)
                    .addComponent(closeStudentButton))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNameFieldActionPerformed

    private void studentSocialSecurityNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSocialSecurityNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentSocialSecurityNumberFieldActionPerformed

    private void studentAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentAddressFieldActionPerformed

    private void studentYearOfBirthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentYearOfBirthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentYearOfBirthFieldActionPerformed

    private void studentMonthOfBirthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentMonthOfBirthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentMonthOfBirthFieldActionPerformed

    private void studentDayOfBirthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDayOfBirthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentDayOfBirthFieldActionPerformed

    private void studentYearOfGraduationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentYearOfGraduationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentYearOfGraduationFieldActionPerformed

    private void studentMonthOfGraduationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentMonthOfGraduationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentMonthOfGraduationFieldActionPerformed

    private void studentDayOfGraduationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDayOfGraduationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentDayOfGraduationFieldActionPerformed

    private void saveStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveStudentButtonActionPerformed
                
        // Retrieve data from the form
        String address = this.studentAddressField.getText();
        String dayOfBirth = this.studentDayOfBirthField.getText();
        String dayOfGraduation = this.studentDayOfGraduationField.getText();
        String monthOfBirth = this.studentMonthOfBirthField.getText();
        String monthOfGraduation = this.studentMonthOfGraduationField.getText();
        String yearOfBirth = this.studentYearOfBirthField.getText();
        String yearOfGraduation = this.studentYearOfGraduationField.getText();
        String name = this.studentNameField.getText();
        String socialSecurityNumber = this.studentSocialSecurityNumberField.getText();
        
        // Convert variables to the variable types appropriate for an object of 
        // Student type. Store data in the created Student object
        aStudent.setAddress(address);
        aStudent.setName(name);
        aStudent.setSocialSecurityNumber(socialSecurityNumber);
        
        int intDayOfBirth = Integer.parseInt(dayOfBirth);
        int intMonthOfBirth = Integer.parseInt(monthOfBirth);
        int intYearOfBirth = Integer.parseInt(yearOfBirth);
        aStudent.setDateOfBirth(intYearOfBirth, intMonthOfBirth, intDayOfBirth);
        
        int intDayOfGraduation = Integer.parseInt(dayOfGraduation);
        int intMonthOfGraduation = Integer.parseInt(monthOfGraduation);
        int intYearOfGraduation = Integer.parseInt(yearOfGraduation);
        aStudent.setDateOfGraduation(intYearOfGraduation, intMonthOfGraduation, intDayOfGraduation);
        
        // Save the data in the datacontainer
        datacontainer.getListOfStudents().add(aStudent);
        
        // Close the window
        this.dispose();
    }//GEN-LAST:event_saveStudentButtonActionPerformed

    private void clearStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearStudentButtonActionPerformed
        clearAllFields();
    }//GEN-LAST:event_clearStudentButtonActionPerformed

    private void closeStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeStudentButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeStudentButtonActionPerformed

    private void addClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassButtonActionPerformed
        // Retrieve the selected class from the selectClassesComboBox
        String selectedClass = (String) this.selectClassesComboBox.getSelectedItem();
        
        StudentClass newStudentClass = new StudentClass();
        //ArrayList<OfferedClass> offeredClasses = new ArrayList<OfferedClass>();
        ArrayList<OfferedClass> offeredClasses = this.datacontainer.getListOfClasses();
        
        // Retrieve the correct OfferedClass from the datacontainer and link it to this StudentClass
        for (OfferedClass anOfferedClass : offeredClasses) {
            if (anOfferedClass.getClassName().equals(selectedClass)) {
                newStudentClass.setClassIdNumber(anOfferedClass.getClassIdNumber());
                newStudentClass.setClassName(anOfferedClass.getClassName());
                newStudentClass.setClassroom(anOfferedClass.getClassroom());
            }
        }
        // Retrieve the grades from the text field
        String stringOfGrades = this.typeInGradesField.getText();
        
        // Divide stringOfGrades into indivigual grades, convert them into float type and store into an ArrayList
        String[] stringGrades = stringOfGrades.split(",");
        
//        ArrayList<String> stringGradesArrayList = new ArrayList(20);
//        
//        for (int i = 0; i < stringGradesArrayList.size(); i++) {
//            stringGradesArrayList.set(i, stringGrades[i].trim());
//        }
//        
//        ArrayList<Float> studentGrades = new ArrayList();
//        
//        for (int i = 0; i < studentGrades.size(); i++) {
//            studentGrades.set(i, Float.parseFloat(stringGradesArrayList.get(i)));
//        }
        
        // Loop through the array of string grades, convert to float and add to list in StudentClass
        for (int i = 0; i < stringGrades.length; i++) {
            newStudentClass.getGrades().add(Float.parseFloat(stringGrades[i]));
        }
        
        // Add grades to the Student Class object
        //newStudentClass.setGrades(studentGrades);
        
        // Add selected class to the Student object
        this.aStudent.getClasses().add(newStudentClass);
        
        // Calculate and set GPA for the student
        float currentGPA = aStudent.calculateGPA();
        this.aStudent.setCurrentGPA(currentGPA);
        
        // Enable Save button
        this.saveStudentButton.setEnabled(true);
        
        // Clear the addClassesPanel fields
        this.selectClassesComboBox.setSelectedIndex(0);
        this.typeInGradesField.setText("");
        
    }//GEN-LAST:event_addClassButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClassButton;
    private javax.swing.JPanel addClassesPanel;
    private javax.swing.JLabel addStudentsLabel;
    private javax.swing.JButton clearStudentButton;
    private javax.swing.JButton closeStudentButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveStudentButton;
    private javax.swing.JComboBox selectClassesComboBox;
    private javax.swing.JLabel selectClassesLabel;
    private javax.swing.JTextField studentAddressField;
    private javax.swing.JLabel studentAddressLabel;
    private javax.swing.JLabel studentDateOfBirthLabel;
    private javax.swing.JLabel studentDateOfGraduationLabel;
    private javax.swing.JTextField studentDayOfBirthField;
    private javax.swing.JTextField studentDayOfGraduationField;
    private javax.swing.JTextField studentMonthOfBirthField;
    private javax.swing.JTextField studentMonthOfGraduationField;
    private javax.swing.JTextField studentNameField;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JTextField studentSocialSecurityNumberField;
    private javax.swing.JLabel studentSocialSecurityNumberLabel;
    private javax.swing.JTextField studentYearOfBirthField;
    private javax.swing.JTextField studentYearOfGraduationField;
    private javax.swing.JTextField typeInGradesField;
    private javax.swing.JLabel typeInGragesLabel;
    // End of variables declaration//GEN-END:variables
}
