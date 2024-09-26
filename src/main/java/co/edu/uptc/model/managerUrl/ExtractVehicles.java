package co.edu.uptc.model.managerUrl;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import co.edu.uptc.model.SimpleList;
import co.edu.uptc.pojos.Vehicle;

public class ExtractVehicles {
    
    private SimpleList<Vehicle> vehicles = new SimpleList<Vehicle>();

    public SimpleList<Vehicle> createVehicleList() throws IOException, URISyntaxException {
        ReadUrl demo = new ReadUrl();
        String data = demo.ReadURL("https://data.wa.gov/api/views/f6w7-q2d2/rows.json?accessType=DOWNLOAD");
        for (ArrayList<Object> element : demo.ReadData(data).data) {
            vehicles.add(createVehicle(element));
            System.out.println(vehicles.get(0).getCity() + " " + vehicles.get(0).getCountry() + " " + vehicles.get(0).getElectricRange());
            break;
        }
        return vehicles;
    }

    private Vehicle createVehicle(ArrayList<Object> element) {
        Vehicle vehicle = new Vehicle();
        vehicle.setCountry((String) element.get(9));
        vehicle.setCity((String) element.get(10));
        vehicle.setState((String) element.get(11));
        vehicle.setManuFacturer((String) element.get(14));
        vehicle.setModelVehicle((String) element.get(15));
        vehicle.setElectricRange(Integer.parseInt((String) element.get(18)));
        return vehicle;
    }
}
