/*
 * This Project was Created By DonMaTrix "THINKING BEYOND LIMITS".
 * By: DONna, MArbin and TRIXon
 * Trixon R. Demapendan
 * Donna G. Paculanang
 * Marbin B. Wong
 * This Code is subject to copyrights
 */

package finaleprojdonmatrix;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.nio.file.FileAlreadyExistsException;

public class javacon {
    Connection con = null;
    public static Connection ConnecrDb(){
        String dbir = "c://datab";
        File f = new File (dbir);
        if(!f.exists()){
            f.mkdir();
        }
       
        String dbName = "Database1.accdb";
        String dbPath = dbir + "/" + dbName;
        File f2 = new File(dbPath);
        if(!f2.exists()){
           InputStream iStream = javacon.class.getResourceAsStream("datab/" + dbName);
           
 //    Files.copy(iStream, f2.getPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            
        try{
    
       String dbU = "jdbc:ucanaccess://" +dbPath;
       Connection  con = DriverManager.getConnection(dbU);
       System.out.println("Con");
        
        return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);     
            return null;
        }
    }
}
