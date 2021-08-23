package com.bhupendra.work;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
    static Connection con;

    public static Connection createC() throws ClassNotFoundException{
        try {
            //load the Driver

            Class.forName("com.mysql.cj.jdbc.Driver");

            //create the connection

            String url="jdbc:mysql://localhost:3306?user= root & password = 121993";

            con= DriverManager.getConnection(url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;

    }
}
