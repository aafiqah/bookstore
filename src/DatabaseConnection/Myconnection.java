/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author sitin
 */
public class Myconnection 
{
    
       
    public static Connection getConnection ()
    {
    Connection con =null;
    try {
        
        Class.forName("com.mysql.jdbc.Driver");
       con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?useTimezone=true&serverTimezone=UTC" ,"root", "");
        
    }catch (Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    return con;
    }
}
