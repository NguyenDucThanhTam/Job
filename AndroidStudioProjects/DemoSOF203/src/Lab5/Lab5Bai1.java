/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Tu Ech
 */
public class Lab5Bai1 {
    public static void main(String[] args) {
        try{
            String user="sa";
            String pass="";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=QLSINHVIEN";
            Connection con = DriverManager.getConnection(url, user,pass);
            String sql="select * from students";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.print(rs.getString("MaSV")+", ");
                System.out.print(rs.getString("Hoten")+", ");
                System.out.print(rs.getString("Email")+", ");
                System.out.print(rs.getString("SoDT")+", ");
                System.out.println(rs.getString("Gioitinh"));
            }
            con.close();
        }catch(Exception e){
                System.out.println(e);
        }
    }
}
