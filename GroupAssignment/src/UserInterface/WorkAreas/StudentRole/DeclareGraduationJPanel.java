/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole;

/**
 *
 * @author rohan
 */
public class DeclareGraduationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestTranscriptJPanel
     */
    public DeclareGraduationJPanel() {
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

        labelDeclareGraduation = new javax.swing.JLabel();
        labelDeclareMessage = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        buttonSubmit = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();

        labelDeclareGraduation.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDeclareGraduation.setText("Request Transcript/Declare Graduation");

        labelDeclareMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDeclareMessage.setText("Declare Graduation and Request Transcript");

        jCheckBox1.setText("Yes");

        buttonSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSubmit.setText("Submit");
        buttonSubmit.setEnabled(false);

        buttonLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonLogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(606, 606, 606)
                .addComponent(labelDeclareGraduation)
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelDeclareMessage)
                        .addGap(171, 171, 171)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(406, 406, 406))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonSubmit)
                        .addGap(563, 563, 563))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonLogout)
                        .addGap(189, 189, 189))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelDeclareGraduation)
                .addGap(8, 8, 8)
                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDeclareMessage)
                    .addComponent(jCheckBox1))
                .addGap(64, 64, 64)
                .addComponent(buttonSubmit)
                .addContainerGap(259, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel labelDeclareGraduation;
    private javax.swing.JLabel labelDeclareMessage;
    // End of variables declaration//GEN-END:variables
}