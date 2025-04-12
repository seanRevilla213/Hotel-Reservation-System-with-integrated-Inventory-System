/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author David Timajo
 */
public class tables {
    public static void main (String[] args) {
    Connection con = null;
    Statement st  = null;
    try{
        con = ConnectionProvider.getCon();
        st = con.createStatement();
        st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(200),mobileNumber varchar(50),email varchar(200),password varchar(50),address carchar(200),status varchar(50))");
                }
                catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        
    }
    finally{
        try{
            con.close();
            st.close();
        }
        catch (Exception e){}
     
    }
}
