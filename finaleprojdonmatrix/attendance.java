package finaleprojdonmatrix;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author asdqwr
 */
public class attendance extends javax.swing.JFrame {
    int xx,xy;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public attendance() {
        con = javacon.ConnecrDb();
        initComponents();
    }
    String b = null,c=null;
     public void UpdateJTable() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date newdate = new Date();
        jDateChooser2.setDate(newdate);
        
         FileReader fr ;
        BufferedReader br;
         
        try{
            fr = new FileReader("C:\\datab\\data1.txt");
            br = new BufferedReader(fr);
            b=br.readLine();        
           
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        try{
            fr = new FileReader("C:\\datab\\data.txt");
            br = new BufferedReader(fr);
            c=br.readLine();        
           
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
         
       String sql = "select * from Dbtstud where subj = '"+b+"'";  
       try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
         jComboBox2.addItem(rs.getString(1));
           }
          
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
       txt41.setText(b);
       String sql1 = "select * from Dbl where username = '"+c+"'";
       try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql1);
           rs = pst.executeQuery();
           pst.execute();
           if(rs.next())
               jLabel3.setText(rs.getString(2));
          
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
      
   }
     public void UpdateStud(){
         FileReader fr ;
        BufferedReader br;
         String b = null,c=null,d=null;
        try{
            fr = new FileReader("C:/datab/data1.txt");
            br = new BufferedReader(fr);
            b=br.readLine();              
        }
        catch(Exception e){
            e.printStackTrace();
        }

        String sql = "select * from Dbtable where stable = '"+"Table 1"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt1.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
       sql = "select * from Dbtable where stable = '"+"Table 2"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt2.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
         sql = "select * from Dbtable where stable = '"+"Table 3"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt3.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 4"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt4.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 5"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt5.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 6"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt6.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 7"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt7.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 8"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt8.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 9"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt9.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 10"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt10.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 11"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt11.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 12"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt12.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 13"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt13.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 14"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt14.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 15"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt15.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 16"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt16.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 17"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt17.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 18"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt18.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 19"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt19.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 20"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt20.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 21"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt21.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 22"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt22.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 23"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt23.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 24"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt24.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 25"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt25.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 26"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt26.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 27"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt27.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 28"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt28.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 29"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt29.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 30"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt30.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 31"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt31.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 32"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt32.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 33"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt33.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 34"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt34.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 35"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt35.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 36"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt36.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 37"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt37.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 38"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt38.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 39"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt39.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
        sql = "select * from Dbtable where stable = '"+"Table 40"+"' and stitle = '"+b+"'";  
        try{
         
           Statement st = con.createStatement();
              pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           pst.execute();
           while(rs.next()){
                txt40.setText(rs.getString(1));
                pst.close();
           }
          
         }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel0 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        j4 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        txt41 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        j2 = new javax.swing.JComboBox<>();
        txt2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        j3 = new javax.swing.JComboBox<>();
        txt3 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        j1 = new javax.swing.JComboBox<>();
        txt1 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        j9 = new javax.swing.JComboBox<>();
        txt9 = new javax.swing.JTextField();
        jPanel31 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        j10 = new javax.swing.JComboBox<>();
        txt10 = new javax.swing.JTextField();
        jPanel32 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        j11 = new javax.swing.JComboBox<>();
        txt11 = new javax.swing.JTextField();
        jPanel33 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        j12 = new javax.swing.JComboBox<>();
        txt12 = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        j17 = new javax.swing.JComboBox<>();
        txt17 = new javax.swing.JTextField();
        jPanel35 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        j18 = new javax.swing.JComboBox<>();
        txt18 = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        j19 = new javax.swing.JComboBox<>();
        txt19 = new javax.swing.JTextField();
        jPanel37 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        j20 = new javax.swing.JComboBox<>();
        txt20 = new javax.swing.JTextField();
        jPanel38 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        j5 = new javax.swing.JComboBox<>();
        txt5 = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        j6 = new javax.swing.JComboBox<>();
        txt6 = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        j7 = new javax.swing.JComboBox<>();
        txt7 = new javax.swing.JTextField();
        jPanel41 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        j8 = new javax.swing.JComboBox<>();
        txt8 = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        j16 = new javax.swing.JComboBox<>();
        txt16 = new javax.swing.JTextField();
        jPanel43 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        j15 = new javax.swing.JComboBox<>();
        txt15 = new javax.swing.JTextField();
        jPanel44 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        j14 = new javax.swing.JComboBox<>();
        txt14 = new javax.swing.JTextField();
        jPanel45 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        j13 = new javax.swing.JComboBox<>();
        txt13 = new javax.swing.JTextField();
        jPanel46 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        j21 = new javax.swing.JComboBox<>();
        txt21 = new javax.swing.JTextField();
        jPanel47 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        j22 = new javax.swing.JComboBox<>();
        txt22 = new javax.swing.JTextField();
        jPanel48 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        j23 = new javax.swing.JComboBox<>();
        txt23 = new javax.swing.JTextField();
        jPanel49 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        j24 = new javax.swing.JComboBox<>();
        txt24 = new javax.swing.JTextField();
        jPanel50 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        j32 = new javax.swing.JComboBox<>();
        txt32 = new javax.swing.JTextField();
        jPanel51 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        j31 = new javax.swing.JComboBox<>();
        txt31 = new javax.swing.JTextField();
        jPanel52 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        j30 = new javax.swing.JComboBox<>();
        txt30 = new javax.swing.JTextField();
        jPanel53 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        j29 = new javax.swing.JComboBox<>();
        txt29 = new javax.swing.JTextField();
        jPanel54 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        j28 = new javax.swing.JComboBox<>();
        txt28 = new javax.swing.JTextField();
        jPanel55 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        j27 = new javax.swing.JComboBox<>();
        txt27 = new javax.swing.JTextField();
        jPanel56 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        j26 = new javax.swing.JComboBox<>();
        txt26 = new javax.swing.JTextField();
        jPanel57 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        j25 = new javax.swing.JComboBox<>();
        txt25 = new javax.swing.JTextField();
        jPanel58 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        j33 = new javax.swing.JComboBox<>();
        txt33 = new javax.swing.JTextField();
        jPanel60 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        j34 = new javax.swing.JComboBox<>();
        txt34 = new javax.swing.JTextField();
        jPanel61 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        j35 = new javax.swing.JComboBox<>();
        txt35 = new javax.swing.JTextField();
        jPanel62 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        j36 = new javax.swing.JComboBox<>();
        txt36 = new javax.swing.JTextField();
        jPanel63 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        j40 = new javax.swing.JComboBox<>();
        txt40 = new javax.swing.JTextField();
        jPanel64 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        j39 = new javax.swing.JComboBox<>();
        txt39 = new javax.swing.JTextField();
        jPanel65 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        j38 = new javax.swing.JComboBox<>();
        txt38 = new javax.swing.JTextField();
        jPanel66 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        j37 = new javax.swing.JComboBox<>();
        txt37 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("X");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1834, 0, -1, -1));

        jLabel0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home17/images/iconviewsub.png"))); // NOI18N
        jPanel1.add(jLabel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 56, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("View Attendance Sheet");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1588, 96, -1, 43));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Seatplan");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 86, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1850, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Table 4");

        txt4.setEditable(false);
        txt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt4MouseClicked(evt);
            }
        });

        j4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 75, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(j4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 200, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Teacher's Table");

        txt41.setEditable(false);
        txt41.setForeground(new java.awt.Color(0, 0, 0));
        txt41.setText("Subject Code");
        txt41.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt41FocusGained(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Save");
        jRadioButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jRadioButton1FocusGained(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Edit");
        jRadioButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jRadioButton2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRadioButton2FocusLost(evt);
            }
        });

        jButton2.setText("Done");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt41, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel3)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jButton2))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText(" Table 2");

        j2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt2.setEditable(false);
        txt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(72, 72, 72))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt2)
                    .addComponent(j2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Table 3");

        j3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt3.setEditable(false);
        txt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(72, 72, 72))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt3)
                    .addComponent(j3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Table 1");

        j1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt1.setEditable(false);
        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(72, 72, 72))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1)
                    .addComponent(j1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setText("Table 9");

        j9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt9.setEditable(false);
        txt9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(72, 72, 72))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt9)
                    .addComponent(j9, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(11, 11, 11)
                .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setText("Table 10");

        j10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt10.setEditable(false);
        txt10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(72, 72, 72))
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt10)
                    .addComponent(j10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addGap(11, 11, 11)
                .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setText("Table 11");

        j11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt11.setEditable(false);
        txt11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(72, 72, 72))
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt11)
                    .addComponent(j11, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addGap(11, 11, 11)
                .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, -1, -1));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setText("Table 12");

        j12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt12.setEditable(false);
        txt12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(72, 72, 72))
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt12)
                    .addComponent(j12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addGap(11, 11, 11)
                .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, -1, -1));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setText("Table 17");

        j17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt17.setEditable(false);
        txt17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(72, 72, 72))
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt17)
                    .addComponent(j17, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addGap(11, 11, 11)
                .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));

        jLabel37.setText("Table 18");

        j18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt18.setEditable(false);
        txt18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(72, 72, 72))
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt18)
                    .addComponent(j18, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addGap(11, 11, 11)
                .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, -1, -1));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setText("Table 19");

        j19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt19.setEditable(false);
        txt19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt19MouseClicked(evt);
            }
        });
        txt19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt19KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(72, 72, 72))
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt19)
                    .addComponent(j19, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addGap(11, 11, 11)
                .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, -1, -1));

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setText("Table 20");

        j20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt20.setEditable(false);
        txt20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(72, 72, 72))
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt20)
                    .addComponent(j20, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addGap(11, 11, 11)
                .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(j20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, -1, -1));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));

        jLabel40.setText("Table 5");

        j5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt5.setEditable(false);
        txt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addGap(72, 72, 72))
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt5)
                    .addComponent(j5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addGap(11, 11, 11)
                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, -1, -1));

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));

        jLabel41.setText("Table 6");

        j6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt6.setEditable(false);
        txt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel41)
                .addGap(72, 72, 72))
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt6)
                    .addComponent(j6, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addGap(11, 11, 11)
                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 340, -1, -1));

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setText("Table 7");

        j7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt7.setEditable(false);
        txt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addGap(72, 72, 72))
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt7)
                    .addComponent(j7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addGap(11, 11, 11)
                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 340, -1, -1));

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setText("Table 8");

        j8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt8.setEditable(false);
        txt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addGap(72, 72, 72))
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt8)
                    .addComponent(j8, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addGap(11, 11, 11)
                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 340, -1, -1));

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setText("Table 16");

        j16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt16.setEditable(false);
        txt16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addGap(72, 72, 72))
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt16)
                    .addComponent(j16, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addGap(11, 11, 11)
                .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 470, -1, -1));

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));

        jLabel45.setText("Table 15");

        j15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt15.setEditable(false);
        txt15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGap(72, 72, 72))
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt15)
                    .addComponent(j15, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addGap(11, 11, 11)
                .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 470, -1, -1));

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setText("Table 14");

        j14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt14.setEditable(false);
        txt14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(72, 72, 72))
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt14)
                    .addComponent(j14, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addGap(11, 11, 11)
                .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 470, -1, -1));

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));

        jLabel47.setText("Table 13");

        j13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt13.setEditable(false);
        txt13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(72, 72, 72))
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt13)
                    .addComponent(j13, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addGap(11, 11, 11)
                .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 470, -1, -1));

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setText("Table 21");

        j21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt21.setEditable(false);
        txt21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addGap(72, 72, 72))
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt21)
                    .addComponent(j21, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addGap(11, 11, 11)
                .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 600, -1, -1));

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setText("Table 22");

        j22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt22.setEditable(false);
        txt22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(72, 72, 72))
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt22)
                    .addComponent(j22, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addGap(11, 11, 11)
                .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 600, -1, -1));

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));

        jLabel50.setText("Table 23");

        j23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt23.setEditable(false);
        txt23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addGap(72, 72, 72))
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt23)
                    .addComponent(j23, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGap(11, 11, 11)
                .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 600, -1, -1));

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setText("Table 24");

        j24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt24.setEditable(false);
        txt24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addGap(72, 72, 72))
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt24)
                    .addComponent(j24, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addGap(11, 11, 11)
                .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 600, -1, -1));

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));

        jLabel52.setText("Table 32");

        j32.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt32.setEditable(false);
        txt32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel52)
                .addGap(72, 72, 72))
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt32)
                    .addComponent(j32, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addGap(11, 11, 11)
                .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 730, -1, -1));

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));

        jLabel53.setText("Table 31");

        j31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt31.setEditable(false);
        txt31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addGap(72, 72, 72))
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt31)
                    .addComponent(j31, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addGap(11, 11, 11)
                .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 730, -1, -1));

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));

        jLabel54.setText("Table 30");

        j30.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt30.setEditable(false);
        txt30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt30MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addGap(72, 72, 72))
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt30)
                    .addComponent(j30, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addGap(11, 11, 11)
                .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 730, -1, -1));

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));

        jLabel55.setText("Table 29");

        j29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt29.setEditable(false);
        txt29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel53Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel55)
                .addGap(72, 72, 72))
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt29)
                    .addComponent(j29, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55)
                .addGap(11, 11, 11)
                .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 730, -1, -1));

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));

        jLabel56.setText("Table 28");

        j28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt28.setEditable(false);
        txt28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel56)
                .addGap(72, 72, 72))
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt28)
                    .addComponent(j28, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addGap(11, 11, 11)
                .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 730, -1, -1));

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setText("Table 27");

        j27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt27.setEditable(false);
        txt27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addGap(72, 72, 72))
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt27)
                    .addComponent(j27, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addGap(11, 11, 11)
                .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 730, -1, -1));

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));

        jLabel58.setText("Table 26");

        j26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt26.setEditable(false);
        txt26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel58)
                .addGap(72, 72, 72))
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt26)
                    .addComponent(j26, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addGap(11, 11, 11)
                .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 730, -1, -1));

        jPanel57.setBackground(new java.awt.Color(255, 255, 255));

        jLabel59.setText("Table 25");

        j25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt25.setEditable(false);
        txt25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel59)
                .addGap(72, 72, 72))
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt25)
                    .addComponent(j25, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addGap(11, 11, 11)
                .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, -1, -1));

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));

        jLabel60.setText("Table 33");

        j33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt33.setEditable(false);
        txt33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel60)
                .addGap(72, 72, 72))
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(j33, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txt33))
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addGap(11, 11, 11)
                .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 860, -1, -1));

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));

        jLabel62.setText("Table 34");

        j34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt34.setEditable(false);
        txt34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel62)
                .addGap(72, 72, 72))
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt34)
                    .addComponent(j34, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addGap(11, 11, 11)
                .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 860, -1, -1));

        jPanel61.setBackground(new java.awt.Color(255, 255, 255));

        jLabel63.setText("Table 35");

        j35.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt35.setEditable(false);
        txt35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addGap(72, 72, 72))
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt35)
                    .addComponent(j35, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addGap(11, 11, 11)
                .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 860, -1, -1));

        jPanel62.setBackground(new java.awt.Color(255, 255, 255));

        jLabel64.setText("Table 36");

        j36.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt36.setEditable(false);
        txt36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addGap(72, 72, 72))
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt36)
                    .addComponent(j36, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addGap(11, 11, 11)
                .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 860, -1, -1));

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));

        jLabel65.setText("Table 40");

        j40.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt40.setEditable(false);
        txt40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt40MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel63Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addGap(72, 72, 72))
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt40)
                    .addComponent(j40, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65)
                .addGap(11, 11, 11)
                .addComponent(txt40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 860, -1, -1));

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));

        jLabel66.setText("Table 39");

        j39.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt39.setEditable(false);
        txt39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt39MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel66)
                .addGap(72, 72, 72))
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt39)
                    .addComponent(j39, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66)
                .addGap(11, 11, 11)
                .addComponent(txt39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 860, -1, -1));

        jPanel65.setBackground(new java.awt.Color(255, 255, 255));

        jLabel67.setText("Table 38");

        j38.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt38.setEditable(false);
        txt38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel67)
                .addGap(72, 72, 72))
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt38)
                    .addComponent(j38, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67)
                .addGap(11, 11, 11)
                .addComponent(txt38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 860, -1, -1));

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));

        jLabel68.setText("Table 37");

        j37.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late" }));

        txt37.setEditable(false);
        txt37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel68)
                .addGap(72, 72, 72))
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt37)
                    .addComponent(j37, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68)
                .addGap(11, 11, 11)
                .addComponent(txt37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 860, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 7", "Table 8", "Table 9", "Table 10", "Table 11", "Table 12", "Table 13", "Table 14", "Table 15", "Table 16", "Table 17", "Table 18", "Table 19", "Table 20", "Table 21", "Table 22", "Table 23", "Table 24", "Table 25", "Table 26", "Table 27", "Table 28", "Table 29", "Table 30", "Table 31", "Table 32", "Table 33", "Table 34", "Table 35", "Table 36", "Table 37", "Table 38", "Table 39", "Table 40" }));

        jButton3.setText("Assign");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, 0, 166, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, 166, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        UpdateJTable();
        UpdateStud();
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        dispose();
        new menu().show();
    }//GEN-LAST:event_jLabel15MousePressed

    private void txt41FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt41FocusGained
       
       txt41.setForeground(Color.black);
    }//GEN-LAST:event_txt41FocusGained

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);

    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j4ActionPerformed

    private void jRadioButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton2FocusGained
          jComboBox2.setVisible(true);
           jComboBox4.setVisible(true);
             jButton3.setVisible(true);
             jPanel7.show();
        
         
    }//GEN-LAST:event_jRadioButton2FocusGained

    private void jRadioButton2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton2FocusLost
        
    }//GEN-LAST:event_jRadioButton2FocusLost

    private void jRadioButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton1FocusGained
        
         jComboBox2.setVisible(false);
           jComboBox4.setVisible(false);
             jButton3.setVisible(false);
             jPanel7.hide();
       
    }//GEN-LAST:event_jRadioButton1FocusGained

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       String sql1;
    
        if(jRadioButton1.isSelected()){
           JOptionPane.showMessageDialog(null, "SUCCESS! PLEASE WAIT WHILE SAVING THE DATA.");
          new loadscreen().show();
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt1.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j1.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 1");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt2.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j2.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 2");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt3.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j3.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 3");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                  
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt4.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j4.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 4");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                   
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt5.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j5.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 5");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                    
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt6.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j6.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 6");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                   
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt7.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j7.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 7");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      
             
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt8.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j8.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 8");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                       
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt9.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j9.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 9");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt10.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j10.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 10");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt11.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j11.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 11");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt12.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j12.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 12");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt13.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j13.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 13");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt14.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j14.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 14");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt15.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j15.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 15");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt16.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j16.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 16");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt17.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j17.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 17");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt18.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j18.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 18");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt19.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j19.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 19");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt20.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j20.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 20");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt21.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j21.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 21");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt22.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j22.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 22");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
               
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt23.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j23.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 23");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt24.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j24.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 24");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt25.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j25.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 25");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt26.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j26.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 26");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt27.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j27.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 27");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt28.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j28.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 28");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt29.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j29.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 29");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt30.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j30.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 30");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt31.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j31.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 31");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt32.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j32.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 32");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt33.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j33.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 33");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt34.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j34.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 34");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt35.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j35.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 35");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt36.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j36.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 36");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt37.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j37.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 37");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt38.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j38.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 38");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt39.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j39.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 39");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();   
                    }
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
                 
                      sql1 = "insert into Dbtable(fname,teacher,stitle,status,date,stable) values(?,?,?,?,?,?)";
                    try{
                     pst = con.prepareStatement(sql1);
                     pst.setString(1, txt40.getText());
                     pst.setString(2, jLabel3.getText());
                     pst.setString(3, txt41.getText());
                     pst.setString(4, (String) j40.getSelectedItem());
                      pst.setString(5, jDateChooser2.getDate().toString());
                      pst.setString(6, "Table 40");
                     System.out.println("Registered");
                        pst.executeUpdate();
                        pst.close();                
                      }
                    
                    catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);
                    }
               
       }        
           
       else
        JOptionPane.showMessageDialog(null, "Enter correct choice");
       
    }//GEN-LAST:event_jButton2MouseClicked
    
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
     if(jComboBox4.getSelectedItem().equals("Table 1")){
         txt1.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 2")){
         txt2.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 3")){
         txt3.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 4")){
         txt4.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 5")){
         txt5.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 6")){
         txt6.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 7")){
         txt7.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 8")){
         txt8.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 9")){
         txt9.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 10")){
         txt10.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 11")){
         txt11.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 12")){
         txt12.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 13")){
         txt13.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 14")){
         txt14.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 15")){
         txt15.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 16")){
         txt16.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 17")){
         txt17.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 18")){
         txt18.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 19")){
         txt19.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 20")){
         txt20.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 21")){
         txt21.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 22")){
         txt22.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 23")){
         txt23.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 24")){
         txt24.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 25")){
         txt25.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 26")){
         txt26.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 27")){
         txt27.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 28")){
         txt28.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 29")){
         txt29.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 30")){
         txt30.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 31")){
         txt31.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 32")){
         txt32.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 33")){
         txt33.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 34")){
         txt34.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 35")){
         txt35.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 36")){
         txt36.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 37")){
         txt37.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 38")){
         txt38.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 39")){
         txt39.setText((String) jComboBox2.getSelectedItem());
     }
     if(jComboBox4.getSelectedItem().equals("Table 40")){
         txt40.setText((String) jComboBox2.getSelectedItem());
     }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
      if(jComboBox4.getSelectedItem().equals("Table 1")){
         txt1.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 2")){
         txt2.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 3")){
         txt3.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 4")){
         txt4.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 5")){
         txt5.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 6")){
         txt6.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 7")){
         txt7.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 8")){
         txt8.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 9")){
         txt9.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 10")){
         txt10.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 11")){
         txt11.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 12")){
         txt12.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 13")){
         txt13.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 14")){
         txt14.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 15")){
         txt15.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 16")){
         txt16.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 17")){
         txt17.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 18")){
         txt18.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 19")){
         txt19.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 20")){
         txt20.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 21")){
         txt21.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 22")){
         txt22.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 23")){
         txt23.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 24")){
         txt24.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 25")){
         txt25.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 26")){
         txt26.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 27")){
         txt27.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 28")){
         txt28.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 29")){
         txt29.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 30")){
         txt30.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 31")){
         txt31.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 32")){
         txt32.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 33")){
         txt33.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 34")){
         txt34.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 35")){
         txt35.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 36")){
         txt36.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 37")){
         txt37.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 38")){
         txt38.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 39")){
         txt39.setText("");
      }
      if(jComboBox4.getSelectedItem().equals("Table 40")){
         txt40.setText("");
      }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new viewat().show();
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void txt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseClicked
         txt1.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt1.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt1.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_txt1MouseClicked

    private void txt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt2MouseClicked
       txt2.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt2.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt2.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_txt2MouseClicked

    private void txt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt3MouseClicked
        // TODO add your handling code here:
        txt3.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt3.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt3.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt3MouseClicked

    private void txt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt4MouseClicked
        // TODO add your handling code here:
        txt4.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt4.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt4.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt4MouseClicked

    private void txt9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt9MouseClicked
        // TODO add your handling code here:
        txt9.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt9.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt9.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt9MouseClicked

    private void txt10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt10MouseClicked
        // TODO add your handling code here:
        txt10.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt10.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt10.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt10MouseClicked

    private void txt11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt11MouseClicked
        // TODO add your handling code here:
        txt11.getText();
      File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt11.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt11.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt11MouseClicked

    private void txt12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt12MouseClicked
        // TODO add your handling code here:
        txt12.getText();
      File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt12.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt12.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt12MouseClicked

    private void txt17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt17MouseClicked
        // TODO add your handling code here:
        txt17.getText();
         File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt17.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt17.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt17MouseClicked

    private void txt18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt18MouseClicked
        // TODO add your handling code here:
        txt18.getText();
         File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt18.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt18.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt18MouseClicked

    private void txt19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt19KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt19KeyPressed

    private void txt19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt19MouseClicked
        // TODO add your handling code here:
        txt19.getText();
       File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt19.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt19.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt19MouseClicked

    private void txt20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt20MouseClicked
        // TODO add your handling code here:
        txt20.getText();
       File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt20.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt20.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt20MouseClicked

    private void txt25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt25MouseClicked
        // TODO add your handling code here:
        txt25.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt25.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt25.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt25MouseClicked

    private void txt26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt26MouseClicked
        // TODO add your handling code here:
        txt26.getText();
     File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt26.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt26.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt26MouseClicked

    private void txt27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt27MouseClicked
        // TODO add your handling code here:
        txt27.getText();
       File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt27.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt27.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt27MouseClicked

    private void txt28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt28MouseClicked
        // TODO add your handling code here:
        txt28.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt28.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt28.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt28MouseClicked

    private void txt33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt33MouseClicked
        // TODO add your handling code here:
        txt33.getText();
       File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt33.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt33.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt33MouseClicked

    private void txt34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt34MouseClicked
        // TODO add your handling code here:
        txt34.getText();
      File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt34.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt34.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt34MouseClicked

    private void txt35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt35MouseClicked
        // TODO add your handling code here:
        txt35.getText();
      File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt35.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt35.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt35MouseClicked

    private void txt36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt36MouseClicked
        // TODO add your handling code here:
        txt36.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt36.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt36.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt36MouseClicked

    private void txt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt5MouseClicked
        // TODO add your handling code here:
        txt5.getText();
       File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt5.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt5.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt5MouseClicked

    private void txt6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt6MouseClicked
        // TODO add your handling code here:
        txt6.getText();
      File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt6.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt6.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt6MouseClicked

    private void txt7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt7MouseClicked
        // TODO add your handling code here:
        txt7.getText();
      File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt7.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt7.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt7MouseClicked

    private void txt8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt8MouseClicked
        // TODO add your handling code here:
        txt8.getText();
         File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt8.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt8.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt8MouseClicked

    private void txt13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt13MouseClicked
        // TODO add your handling code here:
        txt13.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt13.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt13.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt13MouseClicked

    private void txt14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt14MouseClicked
        // TODO add your handling code here:
        txt14.getText();
      File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt14.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt14.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt14MouseClicked

    private void txt15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt15MouseClicked
        // TODO add your handling code here:
        txt15.getText();
      File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt15.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt15.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt15MouseClicked

    private void txt16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt16MouseClicked
        // TODO add your handling code here:
        txt16.getText();
         File newFile = new File("C:\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt16.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt16.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt16MouseClicked

    private void txt21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt21MouseClicked
        // TODO add your handling code here:
        txt21.getText();
       File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt21.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt21.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt21MouseClicked

    private void txt22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt22MouseClicked
        // TODO add your handling code here
        txt22.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt22.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt22.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt22MouseClicked

    private void txt23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt23MouseClicked
        // TODO add your handling code here:
        txt23.getText();
      File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt23.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt23.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt23MouseClicked

    private void txt24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt24MouseClicked
        // TODO add your handling code here:
        txt24.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt24.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt24.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt24MouseClicked

    private void txt29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt29MouseClicked
        // TODO add your handling code here:
        txt29.getText();
       File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt29.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt29.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt29MouseClicked

    private void txt30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt30MouseClicked
        // TODO add your handling code here:
        txt30.getText();
       File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt30.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt30.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt30MouseClicked

    private void txt31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt31MouseClicked
        // TODO add your handling code here:
        txt31.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt31.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt31.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt31MouseClicked

    private void txt32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt32MouseClicked
        // TODO add your handling code here:
        txt32.getText();
      File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt32.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt32.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt32MouseClicked

    private void txt37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt37MouseClicked
        // TODO add your handling code here:
        txt37.getText();
        File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt37.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt37.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt37MouseClicked

    private void txt38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt38MouseClicked
        // TODO add your handling code here:
        txt38.getText();
       File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt38.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt38.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt38MouseClicked

    private void txt39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt39MouseClicked
        // TODO add your handling code here:
        txt39.getText();
      File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt39.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt39.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt39MouseClicked

    private void txt40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt40MouseClicked
        // TODO add your handling code here:
        txt40.getText();
       File newFile = new File("C:\\datab\\data2.txt");
                try {
                    newFile.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                }
                 try {
                     FileWriter filew = new FileWriter(newFile);
                      BufferedWriter buffw = new BufferedWriter(filew);
                     buffw.write((String) txt40.getText());
                     buffw.close();
                     System.out.print("copy");
                  } catch (IOException ex) {
                      Logger.getLogger(Home17.class.getName()).log(Level.SEVERE, null, ex);
                 }
          String sql = "Select * from Dba where Name= ? ";
               try{
                pst = con.prepareStatement(sql);
                pst.setString(1, txt40.getText());
                pst.execute();
                rs =  pst.executeQuery();  
                if(rs.next())
                    new ViewClassStud().show();
                else{
                    JOptionPane.showMessageDialog(null, "No student found");
                }
               }
               catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt40MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> j1;
    private javax.swing.JComboBox<String> j10;
    private javax.swing.JComboBox<String> j11;
    private javax.swing.JComboBox<String> j12;
    private javax.swing.JComboBox<String> j13;
    private javax.swing.JComboBox<String> j14;
    private javax.swing.JComboBox<String> j15;
    private javax.swing.JComboBox<String> j16;
    private javax.swing.JComboBox<String> j17;
    private javax.swing.JComboBox<String> j18;
    private javax.swing.JComboBox<String> j19;
    private javax.swing.JComboBox<String> j2;
    private javax.swing.JComboBox<String> j20;
    private javax.swing.JComboBox<String> j21;
    private javax.swing.JComboBox<String> j22;
    private javax.swing.JComboBox<String> j23;
    private javax.swing.JComboBox<String> j24;
    private javax.swing.JComboBox<String> j25;
    private javax.swing.JComboBox<String> j26;
    private javax.swing.JComboBox<String> j27;
    private javax.swing.JComboBox<String> j28;
    private javax.swing.JComboBox<String> j29;
    private javax.swing.JComboBox<String> j3;
    private javax.swing.JComboBox<String> j30;
    private javax.swing.JComboBox<String> j31;
    private javax.swing.JComboBox<String> j32;
    private javax.swing.JComboBox<String> j33;
    private javax.swing.JComboBox<String> j34;
    private javax.swing.JComboBox<String> j35;
    private javax.swing.JComboBox<String> j36;
    private javax.swing.JComboBox<String> j37;
    private javax.swing.JComboBox<String> j38;
    private javax.swing.JComboBox<String> j39;
    private javax.swing.JComboBox<String> j4;
    private javax.swing.JComboBox<String> j40;
    private javax.swing.JComboBox<String> j5;
    private javax.swing.JComboBox<String> j6;
    private javax.swing.JComboBox<String> j7;
    private javax.swing.JComboBox<String> j8;
    private javax.swing.JComboBox<String> j9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt25;
    private javax.swing.JTextField txt26;
    private javax.swing.JTextField txt27;
    private javax.swing.JTextField txt28;
    private javax.swing.JTextField txt29;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt31;
    private javax.swing.JTextField txt32;
    private javax.swing.JTextField txt33;
    private javax.swing.JTextField txt34;
    private javax.swing.JTextField txt35;
    private javax.swing.JTextField txt36;
    private javax.swing.JTextField txt37;
    private javax.swing.JTextField txt38;
    private javax.swing.JTextField txt39;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt40;
    private javax.swing.JTextField txt41;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
