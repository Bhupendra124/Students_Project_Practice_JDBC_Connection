import com.bhupendra.work.Employees;
import com.bhupendra.work.Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome To Employee_Payroll_Service ");

        while (true)
        {
            System.out.println("Press 1 to Retrive data  ");
            System.out.println("press 2 to exit Connection ");

            //int choice=Integer.parseInt(new InputStreamReader(System.in));
            int choice=Integer.parseInt(br.readLine());
            switch (choice){

                case 1:
                    //retrive data from database
                    System.out.println("Records :");
                  //  Employees employees=new Employees(Name,)
                    Methods.showData();
                    break;
                case 2:
                 break;
            }
        }

    }
}
