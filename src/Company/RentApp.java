package Company;

import Model.ElectricVehicle;
import Model.User;

import java.util.*;

public class RentApp {

    private List<ElectricVehicle> vehicleInventory = new ArrayList<>();
    private List<User> registeredUsers = new ArrayList<>();

    public void addVehicle(ElectricVehicle vehicle){
        vehicleInventory.add(vehicle);
    }

    public void registerUser(User user){
        registeredUsers.add(user);
    }

    public static double calculateDistance(int x, int y, int x1, int y1){
        return Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y-y1,2));
    }

    public List<ElectricVehicle> rentVehicle(User user, String vehicleType){
        TreeMap<Double, ElectricVehicle> tempResult = new TreeMap<>();
        for(int i=0; i < vehicleInventory.size(); i++){
            ElectricVehicle vehicle = vehicleInventory.get(i);
            double distance = calculateDistance(user.getX(), user.getY(), vehicle.getX(), vehicle.getY());
            if(vehicleType.equals(vehicle.getType())){
                tempResult.put(distance,vehicle);
            }
        }

        List<ElectricVehicle> result = new ArrayList<>();
        int j = 0;
        for(Double key : tempResult.keySet()){
            result.add(tempResult.get(key));
            j++;
            if(j == 3){
                break;
            }
        }
        return result;
    }

    public double calculateAverageRidesPerVehicle(){
        double result = 0;
        for(ElectricVehicle vehicle : vehicleInventory){
            result += vehicle.getNoOfRides();
        }
        return result / vehicleInventory.size();
    }
}
