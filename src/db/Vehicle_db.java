package db;

import Model.Vehicle;
import Service.VechicleService;

import java.util.ArrayList;
import java.util.List;

public class Vehicle_db {

    public static List<Vehicle> vlist=new ArrayList<>();
    public static Vehicle_db vehicleDb;
    Vehicle_db()
    {
    }
    public static Vehicle_db getInstance(){
        if (vehicleDb == null){
          vehicleDb = new Vehicle_db();
        }
        return vehicleDb;
    }
}
