/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author SURENDRA
 */
import java.sql.*;
import javax.swing.JOptionPane;
        
public class DbConnect {
    
    public static Connection con;
    public static Statement st;
     public static PreparedStatement checkAdmin,addUser,getUserLike,updateUser,deleteUser,insertPrice,getPrice,addBooking;
     static{
     try{
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","");
         st=con.createStatement();
         //checkAdmin=con.prepareStatement("select * from login where  username=? and password=?");
        //getUserLike=con.prepareStatement("select * from infotb where name like ?");
       // addUser=con.prepareStatement("insert into infotb (eid,name,skill) values(?,?,?)");
       // updateUser=con.prepareStatement("update infotb set id=?,name=?,skill=?");
        addBooking=con.prepareStatement("insert into bookinfo (Route,price,name,number,date) values(?,?,?,?,?)");
       //deleteUser=con.prepareStatement("delete from infotb where id=?");
     insertPrice=con.prepareStatement("insert into setpr values(?,?)");
     getPrice=con.prepareStatement("select price from setpr where route=?");
        
     }
     catch(Exception ex){
         ex.printStackTrace();
     }
     }    
}
