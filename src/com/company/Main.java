package com.company;

import warChallenge.weapons.Points;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test","root","");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}



/* Solution solution = new Solution();
        System.out.println(solution.repeatSeparator("this","and",2));
        System.out.println(solution.xyBalance("aaxbby"));
       // System.out.println(solution.xyBalance("xxxxxxxxxy"));
        System.out.println(solution.prefixAgain("abXYabc", 1));
        System.out.println(solution.zipZap("zzzzzipzop"));*/
//System.out.println(Points.scoresTable("jesus"));
