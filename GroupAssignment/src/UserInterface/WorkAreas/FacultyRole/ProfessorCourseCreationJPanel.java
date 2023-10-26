/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.FacultyRole;

/**
 *
 * @author rohan
 */
public class ProfessorCourseCreationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorCourseCreationJPanel
     */
    public ProfessorCourseCreationJPanel() {
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

        labelCreateCourseTitle = new javax.swing.JLabel();
        labelCourseCode = new javax.swing.JLabel();
        labelCourseName = new javax.swing.JLabel();
        labelIntake = new javax.swing.JLabel();
        labelScheduleDays = new javax.swing.JLabel();
        labelScheduleTime = new javax.swing.JLabel();
        textCourseCode = new javax.swing.JTextField();
        textCourseName = new javax.swing.JTextField();
        checkboxMonday = new javax.swing.JCheckBox();
        checkboxTuesday = new javax.swing.JCheckBox();
        checkboxWednesday = new javax.swing.JCheckBox();
        checkboxThursday = new javax.swing.JCheckBox();
        checkboxFriday = new javax.swing.JCheckBox();
        checkboxSaturday = new javax.swing.JCheckBox();
        checkboxSunday = new javax.swing.JCheckBox();
        buttonSave = new javax.swing.JButton();
        jComboBoxIntake = new javax.swing.JComboBox<>();
        jComboBoxStartTimeHH = new javax.swing.JComboBox<>();
        jComboBoxStartTimeMM = new javax.swing.JComboBox<>();
        labelTo = new javax.swing.JLabel();
        jComboBoxEndTimeHH = new javax.swing.JComboBox<>();
        jComboBoxEndTimeMM = new javax.swing.JComboBox<>();
        labelCourseDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textCourseDescription = new javax.swing.JTextArea();
        labelMode = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        labelCreateCourseTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelCreateCourseTitle.setText("Create Course");

        labelCourseCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCourseCode.setText("Course Code:");

        labelCourseName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCourseName.setText("Course Name:");

        labelIntake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelIntake.setText("Intake:");

        labelScheduleDays.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelScheduleDays.setText("Course Schedule (Days):");

        labelScheduleTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelScheduleTime.setText("Course Schedule (Time):");

        checkboxMonday.setText("Monday");

        checkboxTuesday.setText("Tuesday");

        checkboxWednesday.setText("Wednesday");

        checkboxThursday.setText("Thursday");

        checkboxFriday.setText("Friday");

        checkboxSaturday.setText("Saturday");

        checkboxSunday.setText("Sunday");

        buttonSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonSave.setText("Save");

        jComboBoxIntake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fall 2023", "Spring 2024", "Fall 2024", "Spring 2025" }));

        jComboBoxStartTimeHH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " " }));
        jComboBoxStartTimeHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStartTimeHHActionPerformed(evt);
            }
        });

        jComboBoxStartTimeMM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", " " }));
        jComboBoxStartTimeMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStartTimeMMActionPerformed(evt);
            }
        });

        labelTo.setText("to");

        jComboBoxEndTimeHH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " " }));
        jComboBoxEndTimeHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEndTimeHHActionPerformed(evt);
            }
        });

        jComboBoxEndTimeMM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", " " }));
        jComboBoxEndTimeMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEndTimeMMActionPerformed(evt);
            }
        });

        labelCourseDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCourseDescription.setText("Course Description:");

        textCourseDescription.setColumns(20);
        textCourseDescription.setRows(5);
        jScrollPane1.setViewportView(textCourseDescription);

        labelMode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMode.setText("Mode:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In-Person", "Online" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(600, 600, 600)
                        .addComponent(labelCreateCourseTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelScheduleTime, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelScheduleDays, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIntake, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCourseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkboxMonday)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkboxTuesday))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxStartTimeHH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxStartTimeMM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkboxWednesday)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkboxThursday)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkboxFriday)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkboxSaturday)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkboxSunday))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelTo)
                                        .addGap(40, 40, 40)
                                        .addComponent(jComboBoxEndTimeHH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxEndTimeMM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textCourseCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBoxIntake, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textCourseName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(676, 676, 676)
                        .addComponent(buttonSave)))
                .addContainerGap(500, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(labelCreateCourseTitle)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMode, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIntake, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxIntake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelScheduleDays, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkboxMonday)
                    .addComponent(checkboxTuesday)
                    .addComponent(checkboxWednesday)
                    .addComponent(checkboxThursday)
                    .addComponent(checkboxFriday)
                    .addComponent(checkboxSaturday)
                    .addComponent(checkboxSunday))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelScheduleTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxStartTimeHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxStartTimeMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTo)
                    .addComponent(jComboBoxEndTimeHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEndTimeMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCourseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(buttonSave)
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxStartTimeHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStartTimeHHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStartTimeHHActionPerformed

    private void jComboBoxStartTimeMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStartTimeMMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStartTimeMMActionPerformed

    private void jComboBoxEndTimeHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEndTimeHHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEndTimeHHActionPerformed

    private void jComboBoxEndTimeMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEndTimeMMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEndTimeMMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSave;
    private javax.swing.JCheckBox checkboxFriday;
    private javax.swing.JCheckBox checkboxMonday;
    private javax.swing.JCheckBox checkboxSaturday;
    private javax.swing.JCheckBox checkboxSunday;
    private javax.swing.JCheckBox checkboxThursday;
    private javax.swing.JCheckBox checkboxTuesday;
    private javax.swing.JCheckBox checkboxWednesday;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxEndTimeHH;
    private javax.swing.JComboBox<String> jComboBoxEndTimeMM;
    private javax.swing.JComboBox<String> jComboBoxIntake;
    private javax.swing.JComboBox<String> jComboBoxStartTimeHH;
    private javax.swing.JComboBox<String> jComboBoxStartTimeMM;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCourseCode;
    private javax.swing.JLabel labelCourseDescription;
    private javax.swing.JLabel labelCourseName;
    private javax.swing.JLabel labelCreateCourseTitle;
    private javax.swing.JLabel labelIntake;
    private javax.swing.JLabel labelMode;
    private javax.swing.JLabel labelScheduleDays;
    private javax.swing.JLabel labelScheduleTime;
    private javax.swing.JLabel labelTo;
    private javax.swing.JTextField textCourseCode;
    private javax.swing.JTextArea textCourseDescription;
    private javax.swing.JTextField textCourseName;
    // End of variables declaration//GEN-END:variables
}
