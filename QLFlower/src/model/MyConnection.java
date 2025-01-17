/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Duong Minh Dat
 */
public class MyConnection {
    public static final String username = "root";
    public static final String password = "";
    public static final String url = "jdbc:mySQL://localhost:3306/flower";
    public static Connection con = null ;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Không thể kết nối đến cơ sở dữ liệu !"+ex,"",JOptionPane.WARNING_MESSAGE);
        }
        
        return con;
    }
    
}
