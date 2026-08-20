
package university.management.system;

import java.sql.*;
public class Conn {
   
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//wher is the driver class step 1 of jdbc conectivity :regitering driver
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","haengbok24@me");//step2:connection string
            s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
