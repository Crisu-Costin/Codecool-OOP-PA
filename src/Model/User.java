package Model;

import Company.RentApp;

public class User {

    private String name;
    private String email;
    private int x;
    private int y;
    private ElectricVehicle userVehicle;

    public User(String name, String email, int x, int y) {
        this.name = name;
        this.email = email;
        this.x = x;
        this.y = y;
    }

    public void setUserVehicle(ElectricVehicle userVehicle) {
        this.userVehicle = userVehicle;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ElectricVehicle requestVehicle(String vehicleType, RentApp app){
        return null;
    }

    public void registerToVehicleRentApp(){

    }
}
