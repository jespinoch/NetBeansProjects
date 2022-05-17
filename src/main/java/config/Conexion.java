/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/**
 *
 * @author jorge
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con = null;
    String usuario="root";
    String password="jespin01";
    String bd="acselp";
    String ip="localhost";
    String puerto="3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    public Conexion () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(cadena,usuario,password);
            JOptionPane.showMessageDialog(null,"Si se conecto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: no se conecto"+e.toString());
        }
    }
    
    public Connection getConnection() {
        return con;
    }
}
