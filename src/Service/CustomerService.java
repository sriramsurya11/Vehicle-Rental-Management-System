package Service;

import Model.Customer;
import Model.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {

    public static void customerservice() {
        Scanner sc=new Scanner(System.in);
        Customer cus=new Customer();


        System.out.print("Enter customer_name:");
        String name=sc.next();
        System.out.print("Enter customer_id");
        int n=sc.nextInt();
        System.out.print("Enter your Licence_num:");
        int licence_num=sc.nextInt();


        boolean flag=true;
        System.out.println("1---customer_detail");
        System.out.println("2----Book vehicle.");
        System.out.println("3----search_vehicle.");
        System.out.println("4----Display Vehicle");
        System.out.println("5---Exit");

        System.out.print("Enter:");
        int n=sc.nextInt();
        switch(n)
        {
            case
        }

    }




}
