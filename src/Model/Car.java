package Model;

import java.util.*;


public class Car extends ElectricVehicle{
    private List<User> users = new ArrayList<>();

    public Car(int x, int y) {
        super(x, y, "Car");
    }

    @Override
    public void assignToUser(User user) {
        super.assignToUser(user);
        users.add(user);
    }
}
