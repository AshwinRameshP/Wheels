/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_wheels;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author PlayGOD
 */
public class DBConnect {
    public static Connection connect(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/wheels?","root","nirmmaalyam");
            JOptionPane.showMessageDialog(null,"Connection Success");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return con;
    }
}
    