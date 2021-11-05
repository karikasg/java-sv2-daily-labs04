package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxCapacity;
    private List<Passenger> passengers = new ArrayList<>();

    public boolean addPassenger(Passenger passenger){
        if (passengers.size()<maxCapacity) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int numberOfPackages(){
        int db = 0;
        for (Passenger passenger : passengers){
            db += passenger.getPacket();
        }
        return db;
    }

}
