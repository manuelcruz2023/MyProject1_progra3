package co.edu.uptc.view.main.mainPanels;

import javax.swing.JPanel;
import co.edu.uptc.globals.GlobalView;
import co.edu.uptc.view.main.MainView;

import java.awt.BorderLayout;
import java.awt.Button;

public class PanelMainBody extends JPanel{
    
    MainView mainView;   
     
    public PanelMainBody(MainView mainView) {
        this.mainView = mainView;
        initPanel();
        begin();
        createButtons();
    }

    private void initPanel() {
        this.setBackground(GlobalView.BODY_BACKGROUND_COLOR);
        this.setForeground(GlobalView.BODY_TEXT_COLOR);
        this.setLayout(new BorderLayout());
    }

    private void begin() {
        setVisible(true);
    }

    private void createVehicleButton() {
        Button button = new Button();
        button.setLabel("Vehicles");
        button.setSize(100, 100);
        this.add(button, BorderLayout.EAST);
    }

    private void creatGeographycalButton() {
        Button button = new Button();
        button.setLabel("Geographycal");
        button.setSize(100, 100);
        this.add(button, BorderLayout.WEST);
    }
     
    private void createButtons() {
        createVehicleButton();
        creatGeographycalButton();
    }   
}
