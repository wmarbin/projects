/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaleprojdonmatrix;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asdqwr
 */
public class viewstatussttud extends javax.swing.JInternalFrame {
 Connection con = null;
 PreparedStatement pst = null;
 ResultSet rs = null;
    public viewstatussttud() {
         con = javacon.ConnecrDb();
        initComponents();
         ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelsc = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpresent = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtabsent = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtlate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(570, 270));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelsc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelsc.setText("Subject Name:");
        jPanel1.add(labelsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Student Code:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Present:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtpresent.setEditable(false);
        txtpresent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtpresent, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 100, 30));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setText("Status:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Absent:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        txtabsent.setEditable(false);
        txtabsent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtabsent, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 100, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Late:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        txtlate.setEditable(false);
        txtlate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(txtlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 100, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Subject", "Teacher", "Date/Time", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setEditingColumn(1);
        jTable2.setEditingRow(1);
        jTable2.setEnabled(false);
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable2.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTable2VetoableChange(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 540, 150));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Subject Name:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        labelname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelname.setText("Subject Name:");
        jPanel1.add(labelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable2AncestorAdded
  
    }//GEN-LAST:event_jTable2AncestorAdded

    private void jTable2VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTable2VetoableChange

    }//GEN-LAST:event_jTable2VetoableChange

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
      String b = null,c=null,d=null,f=null;
                               
     FileReader fr ;
     BufferedReader br;
        
        try{
            fr = new FileReader("C:\\datab\\data3.txt");
            br = new BufferedReader(fr);
            c=br.readLine();            
        }
        catch(Exception e){
            e.printStackTrace();
        }
         try{
            fr = new FileReader("C:\\datab\\data2.txt");
            br = new BufferedReader(fr);
            d=br.readLine();            
        }
        catch(Exception e){
            e.printStackTrace();
        }
       labelsc.setText(c);
       String sql = "Select * from Dbk where Scode = '"+c+"'"; 
       try{
                  Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           if(rs.next()){   
               b = rs.getString(2);
                pst.close();  
           }
                
        }
      catch(Exception e){
                 JOptionPane.showConfirmDialog(null, e);
              }
        jTable2.setModel(new DefaultTableModel(null , new String[]{"Name","Subject","Date/Time","Status","Teacher"}));
        
       sql = "select * from Dbtable where fname = '"+d+"' and stitle = '"+b+"'";
       try{
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           while(rs.next()){
               String name = rs.getString(1);
               String subje = rs.getString(3);
               String dat = rs.getString(5);
               String sta = rs.getString(4);
               String tea = rs.getString(2);
               Object[] content = {name,subje,dat,sta,tea};
               DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
               model.addRow(content);
               labelname.setText(rs.getString(3));
           }
           pst.close();
       }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
       int x=0,y=0,z=0;
       sql = "select * from Dbtable where  fname = '"+d+"' and status = '"+"Present"+"' and stitle = '"+b+"'";
       try{
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           while(rs.next()){
               x++;
           }
            String pre =  Integer.toString(x);
            txtpresent.setText(pre);
           pst.close();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
        
       sql = "select * from Dbtable where  fname = '"+d+"' and status = '"+"Absent"+"' and stitle = '"+b+"' ";
       try{
           pst = con.prepareStatement(sql);
       
           rs = pst.executeQuery();
           while(rs.next()){
               y++;
           }
            String pre =  Integer.toString(y);
            txtabsent.setText(pre);
           pst.close();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
       
        sql = "select * from Dbtable where  fname = '"+d+"' and status = '"+"Late"+"' and stitle = '"+b+"' ";
       try{
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           while(rs.next()){
               z++;
           }
            String pre =  Integer.toString(z);
            txtlate.setText(pre);
           pst.close();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel labelsc;
    private javax.swing.JTextField txtabsent;
    private javax.swing.JTextField txtlate;
    private javax.swing.JTextField txtpresent;
    // End of variables declaration//GEN-END:variables
}
