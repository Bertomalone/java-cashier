package LoginAndRegister.connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author bertomalone
 */

public class MyConnection {
    
    public static Connection getConnection() {
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/java_login_register","root","");
        } catch(Exception ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
        
        System.out.println(con);
        return con;
    }
}
