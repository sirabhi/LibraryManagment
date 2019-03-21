
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class javaconnect {
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/account?zeroDateTimeBehavior=convertToNull","root","");
            return con;
     }catch(ClassNotFoundException | SQLException e)
     {
        JOptionPane.showMessageDialog(null,e);
        return null;
     }
    }
}



   