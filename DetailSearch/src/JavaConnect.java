/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajeet
 */
import java.sql.*;
import javax.swing.*;
public class JavaConnect {
    
    Connection conn = null;
    public static Connection ConnectorDB() {
        try {
            //Connection code
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Employee.sqlite");
            JOptionPane.showConfirmDialog(null, "Connection Established");
            return conn;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
