package Model;
import java.util.*;

public class Bike extends ElectricVehicle{
    Random generator = new Random();

    public Bike(int x, int y) {
        super(x, y, "Bike");
    }

    @Override
    public void returnVehicle() {
        int chanceToBreak = generator.nextInt(100);
        if(chanceToBreak <= 15){
            setStatus(VehicleStatus.OutOfOrder);
        } else {
            setStatus(VehicleStatus.Ready);
        }
    }
}
