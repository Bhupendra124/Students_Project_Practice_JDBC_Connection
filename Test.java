package ClassWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        Connection con=null;
        Statement s=null;

        String qury= "insert into user.detail(userId,city,pincode,state,houseNo) values (2,'bhopal', 2872 , 'MP',29)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306?user= root & password = 121993");

            s=con.createStatement();
            s.executeUpdate(qury);
            System.out.println("data inserted in db");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            if (con !=null){
                try {
                    con.close();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                System.out.println("Connection get Closed");
            }
            if (s!=null){
                try {
                    s.close();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                System.out.println("statement get closed" );
            }
        }
    }
}
