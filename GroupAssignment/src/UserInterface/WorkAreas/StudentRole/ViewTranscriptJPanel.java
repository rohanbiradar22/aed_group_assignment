/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole;

import UserInterface.WorkAreas.FacultyRole.*;

/**
 *
 * @author rohan
 */
public class ViewTranscriptJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAndManageCourseJPanel
     */
    public ViewTranscriptJPanel() {
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

        labelViewTranscript = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonRegister = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1500, 600));

        labelViewTranscript.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelViewTranscript.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelViewTranscript.setText("View Transcript");
        labelViewTranscript.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course Name", "Couse Code", "Professor", "Mode", "Credits"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        buttonRegister.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonRegister.setText("Register");
        buttonRegister.setEnabled(false);

        buttonLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonLogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226)
                        .addComponent(buttonRegister))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(labelViewTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218)
                        .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(buttonRegister))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelViewTranscript)
                            .addComponent(buttonLogout))
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelViewTranscript;
    // End of variables declaration//GEN-END:variables
}
