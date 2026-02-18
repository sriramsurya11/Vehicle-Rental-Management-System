package Service;

import java.util.Scanner;

public class Admin {
    public static void admin() {
        System.out.println("1---Add Vehicle");
        System.out.println("2---Remove vehicle");
        System.out.print("Enter");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        int n= sc.nextInt();
        switch (n)
        {
            case 1:
                VechicleService.addVehicle();
            case 2:
                int id=sc.nextInt();
                VechicleService.removevehicle(id);
            default:
                System.out.println("invalid option");
        }


    }
}
