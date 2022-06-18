/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;
import java.util.Scanner;
import java.awt.event.ActionListener;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import Logins.Login;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
/**
 *
 * @author muham
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        btnGroup.add(jbtnSupervisior);
        btnGroup.add(jbtnTrainee);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnRegister = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtStaffName = new javax.swing.JTextField();
        jtxtStaffId = new javax.swing.JTextField();
        jbtnSupervisior = new javax.swing.JRadioButton();
        jbtnTrainee = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));
        setForeground(new java.awt.Color(153, 255, 153));
        setPreferredSize(new java.awt.Dimension(800, 450));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 5, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 450));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Staff Name");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Staff ID");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Staff Postition");

        jbtnRegister.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtnRegister.setText("Register");
        jbtnRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegisterActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setToolTipText("");
        jbtnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel4.setText("Staff Register");

        jtxtStaffName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jtxtStaffId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jbtnSupervisior.setBackground(new java.awt.Color(204, 255, 204));
        jbtnSupervisior.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnSupervisior.setText("Supervisior");

        jbtnTrainee.setBackground(new java.awt.Color(204, 255, 204));
        jbtnTrainee.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnTrainee.setText("Trainee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtStaffName)
                            .addComponent(jtxtStaffId)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnTrainee, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnSupervisior, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jbtnSupervisior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnTrainee)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegisterActionPerformed
        String position = null; 
        position = jbtnSupervisior.getText();  
        position = jbtnTrainee.getText(); 
        String Id = jtxtStaffId.getText();
        String Name = jtxtStaffName.getText();
        
        if(Name.isEmpty()){
                JOptionPane.showMessageDialog(this,"Enter name"); 
            }else if(Id.isEmpty()){
                JOptionPane.showMessageDialog(this,"Enter staff id");
            }else{
                
                if (jbtnTrainee.isSelected()) { 
                    position = jbtnTrainee.getText(); 
                } else if (jbtnSupervisior.isSelected()) { 
                    position = jbtnSupervisior.getText(); 
                }else if (position == null){
                    JOptionPane.showMessageDialog(this,"Please select position"); 
                }else{
                    Staff staff =new Staff();
                    staff.setStaff_name(Name);
                    staff.setStaff_ID(Id);
                    staff.setStaff_position(position);
                    
                    
                }       
            }
        
         String path;
        path= "C:\\Users\\Haikal Fikhri\\Documents\\PackageTravelProject\\src\\StaffData.txt";
        String line="";
            try{

            FileWriter wr=new FileWriter(path,true); 

            wr.append("\n");

            wr.write(Name+",");
            wr.write(Id+",");
            wr.write(position +".");
            wr.close();
            JOptionPane.showMessageDialog(null,"success");

        }
        catch(Exception e)
                {
                 JOptionPane.showMessageDialog(null,"Cannot save!");
                }
         Login Info = new Login();
         dispose();
         Info.setVisible(true);

           
    }//GEN-LAST:event_jbtnRegisterActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtStaffName.setText(null);
         jtxtStaffId.setText(null);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit (0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnRegister;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JRadioButton jbtnSupervisior;
    private javax.swing.JRadioButton jbtnTrainee;
    private javax.swing.JTextField jtxtStaffId;
    private javax.swing.JTextField jtxtStaffName;
    // End of variables declaration//GEN-END:variables

    private static class Staff {

        public Staff() {
        }

        private void setStaff_name(String name) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setStaff_ID(String id) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setStaff_position(String position) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private void systemExit ()
    {
        WindowEvent winCloseing = new WindowEvent (this,WindowEvent.WINDOW_CLOSING);  
    }
}
