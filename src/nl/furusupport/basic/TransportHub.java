package nl.furusupport.basic;

import java.util.ArrayList;
import java.util.List;

public class TransportHub {

    private List vehicleFleet = new ArrayList();




    public void addVehicle(Vehicle newVehicle){
        vehicleFleet.add(newVehicle);

    }


}
