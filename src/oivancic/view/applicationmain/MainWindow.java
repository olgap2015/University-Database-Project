/**
 * Course 90.301
 * Assignment #4-5
 * Last modified: 03/09/2015
 */

package oivancic.view.applicationmain;

/**
 *
 * @author Olga Ivancic
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainWindow() {
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

        mainWindowWelcomeLabel = new javax.swing.JLabel();
        loginIdLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginIdTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        mainWindowOkButton = new javax.swing.JButton();
        mainWindowCloseButton = new javax.swing.JButton();
        mainWindowClearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainWindowWelcomeLabel.setText("Welcome to the University Student/Faculty Database!");

        loginIdLabel.setText("Login ID:");

        passwordLabel.setText("Password:");

        loginIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginIdTextFieldActionPerformed(evt);
            }
        });

        mainWindowOkButton.setText("OK");
        mainWindowOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainWindowOkButtonActionPerformed(evt);
            }
        });

        mainWindowCloseButton.setText("Close");
        mainWindowCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainWindowCloseButtonActionPerformed(evt);
            }
        });

        mainWindowClearButton.setText("Clear");
        mainWindowClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainWindowClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(mainWindowWelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(loginIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passwordLabel)
                                .addGap(20, 20, 20)
                                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mainWindowOkButton)
                                .addGap(25, 25, 25)
                                .addComponent(mainWindowClearButton)
                                .addGap(22, 22, 22)
                                .addComponent(mainWindowCloseButton)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(mainWindowWelcomeLabel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mainWindowOkButton)
                        .addComponent(mainWindowClearButton))
                    .addComponent(mainWindowCloseButton))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIdTextFieldActionPerformed

    private void mainWindowOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainWindowOkButtonActionPerformed
        
        // Create a new MainMenuWindow
        MainMenuWindow newMainMenu = new MainMenuWindow();
        newMainMenu.setSize(452, 370);
        newMainMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mainWindowOkButtonActionPerformed

    private void mainWindowClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainWindowClearButtonActionPerformed
        this.loginIdTextField.setText("");
        this.PasswordField.setText("");
    }//GEN-LAST:event_mainWindowClearButtonActionPerformed

    private void mainWindowCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainWindowCloseButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mainWindowCloseButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel loginIdLabel;
    private javax.swing.JTextField loginIdTextField;
    private javax.swing.JButton mainWindowClearButton;
    private javax.swing.JButton mainWindowCloseButton;
    private javax.swing.JButton mainWindowOkButton;
    private javax.swing.JLabel mainWindowWelcomeLabel;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
