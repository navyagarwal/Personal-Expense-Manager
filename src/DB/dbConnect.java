/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ananyasrivastava
 */
public class dbConnect {
    public static Connection c;
    public static Statement st;
    static{
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false", "root", "jDbRGx6dJuv3WqLu");
            st = c.createStatement();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
