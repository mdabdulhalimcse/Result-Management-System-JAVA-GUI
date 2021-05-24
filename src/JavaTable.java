
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JavaTable extends javax.swing.JFrame {

    public JavaTable() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jyear = new javax.swing.JTextField();
        jcourse_2 = new javax.swing.JTextField();
        jname = new javax.swing.JTextField();
        jsemester = new javax.swing.JComboBox<>();
        jdepartment = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jid = new javax.swing.JTextField();
        jcourse_1 = new javax.swing.JTextField();
        jcourse_4 = new javax.swing.JTextField();
        jcgpa_4 = new javax.swing.JTextField();
        jcgpa_2 = new javax.swing.JTextField();
        jcgpa_1 = new javax.swing.JTextField();
        jprocess = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jexit = new javax.swing.JButton();
        jprint = new javax.swing.JButton();
        jcourse_3 = new javax.swing.JTextField();
        jcgpa_3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtextarea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Result Management System");
        setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6), "Information Input", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Semester:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Department:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Year:");

        jyear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jyear.setForeground(new java.awt.Color(0, 0, 0));
        jyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jyearActionPerformed(evt);
            }
        });

        jcourse_2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcourse_2.setForeground(new java.awt.Color(0, 0, 0));
        jcourse_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcourse_2ActionPerformed(evt);
            }
        });

        jname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jname.setForeground(new java.awt.Color(0, 0, 0));

        jsemester.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jsemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Spring", "Summer", "Fall" }));

        jdepartment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jdepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "CSE", "SWE", "EEE", "TE", "BBA" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Course Code");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("CGPA");

        jid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jid.setForeground(new java.awt.Color(0, 0, 0));

        jcourse_1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcourse_1.setForeground(new java.awt.Color(0, 0, 0));
        jcourse_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcourse_1ActionPerformed(evt);
            }
        });

        jcourse_4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcourse_4.setForeground(new java.awt.Color(0, 0, 0));
        jcourse_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcourse_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcourse_4ActionPerformed(evt);
            }
        });

        jcgpa_4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcgpa_4.setForeground(new java.awt.Color(0, 0, 0));
        jcgpa_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcgpa_4ActionPerformed(evt);
            }
        });

        jcgpa_2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcgpa_2.setForeground(new java.awt.Color(0, 0, 0));
        jcgpa_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcgpa_2ActionPerformed(evt);
            }
        });

        jcgpa_1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcgpa_1.setForeground(new java.awt.Color(0, 0, 0));
        jcgpa_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcgpa_1ActionPerformed(evt);
            }
        });

        jprocess.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jprocess.setText("Process");
        jprocess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprocessActionPerformed(evt);
            }
        });

        jreset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jreset.setText("Reset");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });

        jdelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jdelete.setText("Delete");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });

        jexit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jexit.setForeground(new java.awt.Color(204, 0, 0));
        jexit.setText("Exit");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });

        jprint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jprint.setText("Print");
        jprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprintActionPerformed(evt);
            }
        });

        jcourse_3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcourse_3.setForeground(new java.awt.Color(0, 0, 0));
        jcourse_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcourse_3ActionPerformed(evt);
            }
        });

        jcgpa_3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcgpa_3.setForeground(new java.awt.Color(0, 0, 0));
        jcgpa_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcgpa_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jprocess)
                        .addGap(18, 18, 18)
                        .addComponent(jreset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jname)
                        .addComponent(jyear)
                        .addComponent(jsemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jid, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jprint))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcourse_2)
                                    .addComponent(jcourse_1)
                                    .addComponent(jcourse_4, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(jcourse_3))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcgpa_1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcgpa_4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcgpa_2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jexit)
                                    .addComponent(jcgpa_3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jsemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcourse_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcourse_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcourse_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcourse_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcgpa_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcgpa_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcgpa_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcgpa_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jprocess)
                    .addComponent(jreset)
                    .addComponent(jdelete)
                    .addComponent(jexit)
                    .addComponent(jprint))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 900, 430));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 6), "Display", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jtextarea.setColumns(20);
        jtextarea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jtextarea.setRows(5);
        jScrollPane1.setViewportView(jtextarea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 380, 450));

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Department", "Semester", "Year", "Course-1", "Course-1 CGPA ", "Course_2", "Course-2 CGPA ", "Course-3", "Course-3 CGPA ", "Course-4", "Course-4 CGPA", "Average CGPA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 1300, 190));
        getContentPane().add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, -1, 670));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcgpa_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcgpa_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcgpa_1ActionPerformed

    private void jcgpa_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcgpa_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcgpa_2ActionPerformed

    private void jcgpa_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcgpa_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcgpa_4ActionPerformed

    private void jcourse_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcourse_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcourse_4ActionPerformed

    private void jcourse_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcourse_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcourse_1ActionPerformed

    private void jcourse_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcourse_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcourse_2ActionPerformed

    private void jyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jyearActionPerformed

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_jexitActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed

        jtextarea.setText("");
        jname.setText("");
        jid.setText("");
        jyear.setText("");
        jcourse_1.setText("");
        jcourse_2.setText("");
        jcourse_3.setText("");
        jcourse_4.setText("");
        jcgpa_1.setText("");
        jcgpa_2.setText("");
        jcgpa_3.setText("");
        jcgpa_4.setText("");
        jdepartment.setSelectedItem("Select");
        jsemester.setSelectedItem("Select");
    }//GEN-LAST:event_jresetActionPerformed

    private void jprocessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprocessActionPerformed

        try {
        float number =
                
                Float.parseFloat(jcgpa_1.getText()) +
                Float.parseFloat(jcgpa_2.getText()) +
                Float.parseFloat(jcgpa_3.getText()) + 
                Float.parseFloat(jcgpa_4.getText()) ;
         
        float average = number/4;
        
        DefaultTableModel model = (DefaultTableModel)jtable.getModel();
        model.addRow(new Object[]{
            jname.getText(),
            jid.getText(),
            jdepartment.getSelectedItem(),
            jsemester.getSelectedItem(),
            jyear.getText(),
            jcourse_1.getText(),
            jcgpa_1.getText(),
            jcourse_2.getText(),
            jcgpa_2.getText(),
            jcourse_3.getText(),
            jcgpa_3.getText(),
            jcourse_4.getText(),
            jcgpa_4.getText(),
            average
            
        });
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Fillup All The Fields\n"+ex);
        }
        
    }//GEN-LAST:event_jprocessActionPerformed

    private void jcourse_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcourse_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcourse_3ActionPerformed

    private void jprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprintActionPerformed
try { 
        
        float number_1 =
                
                Float.parseFloat(jcgpa_1.getText()) +
                Float.parseFloat(jcgpa_2.getText()) +
                Float.parseFloat(jcgpa_3.getText()) + 
                Float.parseFloat(jcgpa_4.getText()) ;
         
        float average_1 = number_1/4;
        
        jtextarea.append("\t   Struent Result System\n"
          +"========================================="
            +"\nName:\t\t\t " + jname.getText()
            +"\nID:\t\t\t " +jid.getText()
            +"\nDepartment:\t\t "+jdepartment.getSelectedItem()
            +"\nSemester:\t\t " + jsemester.getSelectedItem()
            +"\nYear:\t\t\t " + jyear.getText()
            +"\n"+jcourse_1.getText()+":"
            +"\t\t\t "+jcgpa_1.getText()
            +"\n"+jcourse_2.getText()+":"
            +"\t\t\t "+jcgpa_2.getText()
            +"\n"+jcourse_3.getText()+":"
            +"\t\t\t "+jcgpa_3.getText()
            +"\n"+jcourse_4.getText()+":"
            +"\t\t\t "+jcgpa_4.getText()
            +"\n========================================="    
            +"\nAverager cgpa:\t\t" + average_1
  
        );
  
  

        try {
            jtextarea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(JavaTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }catch(Exception ex){
    JOptionPane.showMessageDialog(null,"Please Fillup All The Fields\n"+ ex);
    }
  
        
    }//GEN-LAST:event_jprintActionPerformed

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jtable.getModel();
        
        try {
        int selectedrow = jtable.getSelectedRow();
        model.removeRow(selectedrow);
        }catch(Exception ex)  {
            JOptionPane.showMessageDialog(null,"please Select Row\n"+ex);
        }
            
        
        
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jcgpa_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcgpa_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcgpa_3ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jcgpa_1;
    private javax.swing.JTextField jcgpa_2;
    private javax.swing.JTextField jcgpa_3;
    private javax.swing.JTextField jcgpa_4;
    private javax.swing.JTextField jcourse_1;
    private javax.swing.JTextField jcourse_2;
    private javax.swing.JTextField jcourse_3;
    private javax.swing.JTextField jcourse_4;
    private javax.swing.JButton jdelete;
    private javax.swing.JComboBox<String> jdepartment;
    private javax.swing.JButton jexit;
    private javax.swing.JTextField jid;
    private javax.swing.JTextField jname;
    private javax.swing.JButton jprint;
    private javax.swing.JButton jprocess;
    private javax.swing.JButton jreset;
    private javax.swing.JComboBox<String> jsemester;
    private javax.swing.JTable jtable;
    private javax.swing.JTextArea jtextarea;
    private javax.swing.JTextField jyear;
    // End of variables declaration//GEN-END:variables
}
