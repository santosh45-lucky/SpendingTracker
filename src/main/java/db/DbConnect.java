/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author santo
 */
public class DbConnect {
    public static Connection c;
    public static Statement st;
    static{
         try{
             Connection c=DriverManager.getConnection("jdbc:mysql://localhost/spendingdb", "root","rootpassword");
             st=c.createStatement();
            
         }catch(Exception e)
         {
              JOptionPane.showMessageDialog(null, e);

         }
         
    }
    
}
