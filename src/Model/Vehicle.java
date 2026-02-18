package Model;

public class Vehicle {
    private int vehicle_id;
    private String vehicle_name;
    private String vechicle_color;
    private float vechile_price;

    public Vehicle(int vehicleId, String vehicleName, String vechicleColor, float vechilePrice) {
        vehicle_id = vehicleId;
        vehicle_name = vehicleName;
        vechicle_color = vechicleColor;
        vechile_price = vechilePrice;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    public String getVechicle_color() {
        return vechicle_color;
    }

    public void setVechicle_color(String vechicle_color) {
        this.vechicle_color = vechicle_color;
    }

    public float getVechile_price() {
        return vechile_price;
    }

    public void setVechile_price(float vechile_price) {
        this.vechile_price = vechile_price;
    }
}
