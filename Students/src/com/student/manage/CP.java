package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    static Connection con;
    public static Connection createC() throws ClassNotFoundException {

        try {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create the Connection
//            String user="121993";
//            String password="121993";
            String url="jdbc:mysql://localhost:3306?user= root & password = 121993";
            con= DriverManager.getConnection(url);
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }

}
