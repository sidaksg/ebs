package hotel_management_system;

import java.sql.*;


//this code is to establish a connectuion to our builted database so we can rterieve our desired query(s).
public class conn {
    Connection c;
    Statement s;
    public conn(){
    try{
        Class.forName("com.mysql.jdbc.driver");
        c = DriverManager.getConnection("jdbc:mysql://hms", "root" ,"sidak001@ ");
        s =c.createStatement();
    }catch(Exception e){
        System.out.println(e);
    }
}
}