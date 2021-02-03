package Model;

import java.util.*;

public class Scooter extends ElectricVehicle{

    Random generator = new Random();

    public Scooter(int x, int y) {
        super(x, y, "Scooter");
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
