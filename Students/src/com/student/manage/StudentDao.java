package com.student.manage;

import java.sql.*;

public class StudentDao {
    public static boolean insertStudentToDB(Student st){
        boolean f=false;
        try {
            Connection con = CP.createC();
            String q="insert into student_manage.students(sname,sphone,scity) values (?,?,?)";
            //PreparedStatement
           PreparedStatement pstmt= con.prepareStatement(q);
           //Set the value of parameter
            pstmt.setString(1,st.getStudentName());
            pstmt.setString(2,st.getStudentPhone());
            pstmt.setString(3,st.getStudentCity());

            //excute..
            pstmt.executeUpdate();
            f=true;
        }catch (Exception e){
            e.printStackTrace();
        }return f;
    }

    public static boolean deleteStudent(int userId) {
        boolean f=false;
        try {
            Connection con = CP.createC();
            String q="delete from  student_manage.students where sid=?";
            //PreparedStatement
            PreparedStatement pstmt= con.prepareStatement(q);
            //Set the value of parameter
            pstmt.setInt(1,userId);


            //excute..
            pstmt.executeUpdate();
            f=true;
        }catch (Exception e){
            e.printStackTrace();
        }return f;
    }

    public static void showAllStudent() {
        boolean f=false;
        try {
            Connection con = CP.createC();
            String q="select * from  student_manage.students ;";
            Statement stmt=con.createStatement();
            //PreparedStatement
            PreparedStatement pstmt= con.prepareStatement(q);
            //Set the value of parameter
          ResultSet set= stmt.executeQuery(q);
           while (set.next())
           {
               int id =set.getInt(1);
               String name=set.getString(2);
               String phone=set.getString(3);
               String city=set.getString("scity");

               System.out.println("ID:  "+id);
               System.out.println("Name: "+name);
               System.out.println("Phone: "+phone);
               System.out.println("City:"+city);
               System.out.println("++++++++++============");




        }
    } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

