/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase.DbConnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;


public class DBConnection {

    
        public static Connection conn;
        private static String sql;
    
public static void connect() {
try 
    {
        conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/BazaPodataka","root","");
    }catch (SQLException ex) 
        {
            System.out.println("Connection problem");
        }
    }
public static ResultSet adminLogin(String username,String password) throws SQLException {
        connect();
        sql="Select * from admin where username=? and password=?";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs=pst.executeQuery();
        
 
        return rs;
     }
public static void delete(int student_id) throws SQLException{
        connect();
        String sql="delete from students where student_id=?";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setInt(1, student_id);
        pst.execute();
        pst.close();
}
public static void deleteAdmin(int id) throws SQLException{
        connect();
        sql="delete from admin where id=?";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setInt(1,id);
        pst.execute();
        pst.close();
}
public static void adminAccountCreation(String username,String password ) throws SQLException{
        connect();
        String sql="insert into admin values(null,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,username);
        pst.setString(2,password);
        pst.execute();
        pst.close();
     }
public static void register(String name,String surname,long contact,String email,String state,String city,String address,String course,String dateofbirth) throws SQLException{
        connect();
        String sql="insert into students values(null,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,name);
        pst.setString(2,surname);
        pst.setLong(3, contact);
        pst.setString(4,email);
        pst.setString(5,state);
        pst.setString(6, city);                 
        pst.setString(7,address);
        pst.setString(8,course);
        pst.setString(9,dateofbirth);
        pst.execute();
        pst.close();
    }

public static void add(String name,String surname,long contact,String email,String state,String city,String address,String course,String dateofbirth) throws SQLException{
        connect();
        String sql="insert into students values(null,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,name);
        pst.setString(2,surname);
        pst.setLong(3, contact);
        pst.setString(4,email);
        pst.setString(5,state);
        pst.setString(6, city);
        pst.setString(7,address);
        pst.setString(8,course);
        pst.setString(9, dateofbirth);
        pst.execute();
        pst.close();
    }
public static void update(int student_id,String name,String surname,long contact,String email,String state,String city,String address,String course,String dateofbirth) throws SQLException{
        connect();
        String sql="update Students SET student_id='"+student_id+"', name='"+name +"',surname='"+surname+"',contact='"+contact+"',email='"+email+"',state='"+state+"',city='"+city+"',address='"+address+"',course='"+course+"',dateofbirth='"+dateofbirth+"' where student_id='"+student_id+"'";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        pst.close();//metoda setstring ubacuje parametar jtxf1 y prp statemen 
 
     }
public static void refreshTable(JTable jtable1) throws SQLException {
        connect();
        String sql="Select * from students";
        PreparedStatement pst=conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        jtable1.setModel(DbUtils.resultSetToTableModel(rs));
        pst.close();
        rs.close();
        conn.close();
    }
public static void refreshTableAdmin(JTable jtable2) throws SQLException {
        connect();
        String sql="Select * from admin";
        PreparedStatement pst=conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        jtable2.setModel(DbUtils.resultSetToTableModel(rs));
        pst.close();
        rs.close();
        conn.close();
    }
public static void searchname(JTable jtable1,JTextField jTextField1) throws SQLException{
        connect();
        String sql="select * from students where name=?";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1,jTextField1.getText());
        ResultSet rs=pst.executeQuery();
        jtable1.setModel(DbUtils.resultSetToTableModel(rs));
        pst.close();
        rs.close();
    }
public static void searchsurname(JTable jtable1,JTextField jTextField2) throws SQLException{
        connect();
        String sql="select * from students where surname=?";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1,jTextField2.getText());
        ResultSet rs=pst.executeQuery();
        jtable1.setModel(DbUtils.resultSetToTableModel(rs));
        pst.close();
        rs.close();
    }
public static void searchID(JTable jtable1,JTextField jTextField3) throws SQLException{
        connect();
        String sql="select * from students where student_id=?";
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1,jTextField3.getText());
        ResultSet rs=pst.executeQuery();
        jtable1.setModel(DbUtils.resultSetToTableModel(rs));
        pst.close();
        rs.close();
    }  
}  

  
