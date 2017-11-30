/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 *///executeUpdate()
public class Statement2 {
    public static void main(String[] args) {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=EMPDB";
            Connection con = DriverManager.getConnection(url,"sa","");
            Statement stm = con.createStatement();          
            //String sql="INSERT INTO Employees VALUES (11, N'Tí', N'Phan Văn', 22);";
            String sql="delete from Employees where id=11";
            int rows = stm.executeUpdate(sql);
            System.out.println("Rows: "+rows);
            stm.close();con.close();
        }catch(Exception e){
            System.out.println(e);          
        }
    }
}
