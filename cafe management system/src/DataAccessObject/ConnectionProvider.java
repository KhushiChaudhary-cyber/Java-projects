/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;
import java.sql.*;
/**
 *
 * @author hp
 */
public class ConnectionProvider {
     public static Connection getConn(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CMS?useSSL=false","root","haengbok24@me");
             return con;
         }
             catch(Exception e){
                     return null;
                     }
     }
}
