/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package restaurantsystem.component.driver;

import java.sql.*;

public class Driver {
    public static void main(String args[]) {
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");
            Statement myStat = myConn.createStatement();
            ResultSet myRs1 = myStat.executeQuery("select * from items");
            ResultSet myRs2 = myStat.executeQuery("select * from labour");
           
            String sql1 = "insert into item"+"(item_name,item_price,item_quantity)"+"values()";
            String sql2 = "insert into labour"+"(emp_id,emp_name,emp_salary)"+"values()";
            myStat.executeUpdate(sql1);
            myStat.executeUpdate(sql2);
            
            String update1 = "update items"+"";
            String update2 = "update labour"+"";
            }
            
            System.out.println("Item_Name\tItem_Price\tItem_Quantity");
            while(myRs1.next()){
                System.out.println(myRs1.getString("item_name")+"\t"+myRs1.getString("item_price")+myRs1.getString("item_quantity"));
            }
            
            System.out.println("Employee_ID\tEmployee_Name\tEmployee_Salary");
            while(myRs1.next()){
                System.out.println(myRs1.getString("emp_id")+"\t"+myRs1.getString("emp_name")+myRs1.getString("emp_salary"));
            
        }
        catch(Exception ex){
            
        }
    }
}*/
