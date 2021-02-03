package Model;

public abstract class ElectricVehicle {
    private static int counter = 0;
    private int id;
    private int x;
    private int y;
    private int noOfRides = 0;
    private VehicleStatus status = VehicleStatus.Ready;
    private String type;

    public ElectricVehicle(int x, int y, String type) {
        this.id = counter ++;
        this.x = x;
        this.y = y;
        this.type = type;

    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getNoOfRides() {
        return noOfRides;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public void assignToUser(User user){
        user.setUserVehicle(this);
        noOfRides ++;
        status = VehicleStatus.InUse;
    }

    public void returnVehicle(){
        status = VehicleStatus.Ready;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}
