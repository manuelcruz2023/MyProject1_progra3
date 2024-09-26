package co.edu.uptc;

import java.io.IOException;
import java.net.URISyntaxException;

import co.edu.uptc.model.managerUrl.ExtractVehicles;
import co.edu.uptc.view.main.MainView;

public class Main {
    public static void main(String[] args) {
        MainView mainView = new MainView();
        //mainView.begin();
        ExtractVehicles extractVehicles = new ExtractVehicles();
        try {
            extractVehicles.createVehicleList();
        } catch (IOException | URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}