/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Fpoly
 */
public class DemoPreparedStatement {
    public static void main(String[] args) {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=EMPDB";
            Connection con = DriverManager.getConnection(url,"sa","");         
            String sql="UPDATE Employees set age=? WHERE id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, 40); 
            stm.setInt(2, 7);
            int rows = stm.executeUpdate();
            System.out.println("Rows: " + rows);
            stm.close();con.close();
        }catch(Exception e){
            System.out.println(e);          
        }
    }
}
