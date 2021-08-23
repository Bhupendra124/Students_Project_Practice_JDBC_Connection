package com.bhupendra.work;

import java.sql.*;

public class Methods {

    public static void showData() {
        boolean f = false;
        try {
            Connection con = CP.createC();

            String qury = "Select * from payroll_services.employee_payroll ";
            Statement stmt = con.createStatement();

            //prepared statement
            PreparedStatement pstmt = con.prepareStatement(qury);

            //set the value of parameter
            ResultSet set = stmt.executeQuery(qury);

            while (set.next()) {
                int id = set.getInt(1);
                String Name = set.getString(2);
                String Phone = set.getString(3);
                String City = set.getString(4);
                String Department = set.getString(5);
                String Gender = set.getString(6);


                System.out.println("ID:  " + id);
                System.out.println("Name: " + Name);
                System.out.println("Phone: " + Phone);
                System.out.println("City:" + City);
                System.out.println("Department: "+Department);
                System.out.println("Gender:  "+ Gender);
                System.out.println("++++++++++============");


            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }

    }
}
