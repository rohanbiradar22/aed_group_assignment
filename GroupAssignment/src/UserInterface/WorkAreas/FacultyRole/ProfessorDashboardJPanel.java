/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.FacultyRole;

/**
 *
 * @author rohan
 */
public class ProfessorDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FacultyDashboardJPanel
     */
    public ProfessorDashboardJPanel() {
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

        labelProfessorDashboard = new javax.swing.JLabel();
        buttonProfessorManageCourse = new javax.swing.JButton();
        buttonProfessorViewStudents = new javax.swing.JButton();
        buttonProfessorLogout = new javax.swing.JButton();

        labelProfessorDashboard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelProfessorDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProfessorDashboard.setText("Hello Professor");
        labelProfessorDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        buttonProfessorManageCourse.setBackground(new java.awt.Color(153, 153, 153));
        buttonProfessorManageCourse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonProfessorManageCourse.setForeground(new java.awt.Color(255, 255, 255));
        buttonProfessorManageCourse.setText("Manage Course");
        buttonProfessorManageCourse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonProfessorViewStudents.setBackground(new java.awt.Color(153, 153, 153));
        buttonProfessorViewStudents.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonProfessorViewStudents.setForeground(new java.awt.Color(255, 255, 255));
        buttonProfessorViewStudents.setText("View Enrolled Students");
        buttonProfessorViewStudents.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonProfessorLogout.setBackground(new java.awt.Color(153, 153, 153));
        buttonProfessorLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonProfessorLogout.setForeground(new java.awt.Color(255, 255, 255));
        buttonProfessorLogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(buttonProfessorManageCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                .addComponent(buttonProfessorViewStudents)
                .addGap(314, 314, 314))
            .addComponent(labelProfessorDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(686, 686, 686)
                .addComponent(buttonProfessorLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelProfessorDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonProfessorViewStudents)
                    .addComponent(buttonProfessorManageCourse))
                .addGap(48, 48, 48)
                .addComponent(buttonProfessorLogout)
                .addContainerGap(280, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonProfessorLogout;
    private javax.swing.JButton buttonProfessorManageCourse;
    private javax.swing.JButton buttonProfessorViewStudents;
    private javax.swing.JLabel labelProfessorDashboard;
    // End of variables declaration//GEN-END:variables
}