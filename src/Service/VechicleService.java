package Service;

import Model.Vehicle;
import db.Vehicle_db;

import java.util.Scanner;

public class VechicleService {

    public static void addVehicle(){
        Scanner sc=new Scanner(System.in);
         int vehicle_id;
         String vehicle_name;
         String vehicle_color;
         float vehicle_price;
        System.out.print("Enter Vehicle_id:");
        vehicle_id=sc.nextInt();
        System.out.print("Enter vehicle_name:");
        vehicle_name= sc.next();
        System.out.print("Enter Vehicle_color");
        vehicle_color =sc.next();
        System.out.print("Enter vehicle_price:");
        vehicle_price=sc.nextFloat();
        Vehicle newVehicle = new Vehicle(vehicle_id,vehicle_name, vehicle_color,vehicle_price);
        Vehicle_db vehicle_db = Vehicle_db.getInstance();
        Vehicle_db.vlist.add(newVehicle);
    }
    public static void removevehicle(int id)
    {
         Vehicle_db vehicleDb=Vehicle_db.getInstance();
         for(Vehicle vehicle: Vehicle_db.vlist)
         {
            if(vehicle.getVehicle_id()==id)
            {
                Vehicle_db.vlist.remove(vehicle);
                break;
            }
         }
    }
}
