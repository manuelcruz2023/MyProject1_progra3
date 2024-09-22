package co.edu.uptc.view.main.mainPanels;

import javax.swing.JPanel;

import co.edu.uptc.globals.GlobalView;
import co.edu.uptc.view.dialogs.dialogVehicleAnalysis.MainVehicleAnalysis;
import co.edu.uptc.view.main.MainView;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class PanelMainBody extends JPanel{
    
    public MainView mainView;   
     
    public PanelMainBody(MainView mainView) {
        this.mainView = mainView;
        initPanel();
        begin();
        createButtons();
    }

    private void initPanel() {
        this.setBackground(GlobalView.BODY_BACKGROUND_COLOR);
        this.setForeground(GlobalView.BODY_TEXT_COLOR);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 300, 10));
    }

    private void begin() {
        setVisible(true);
    }

    private void createVehicleButton() {
        Button button = new Button();
        button.setLabel("Vehicles");
        button.setPreferredSize(new Dimension(200, 200));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createVehicleAnalysisDialog();
            }
        });
        this.add(button);
    }

    private void creatGeographycalButton() {
        Button button = new Button();
        button.setLabel("Geographycal");
        button.setPreferredSize(new Dimension(200, 200));
        this.add(button);
    }
     
    private void createButtons() {
        createVehicleButton();
        creatGeographycalButton();
    }   

    private void createVehicleAnalysisDialog() {
        MainVehicleAnalysis mainVehicleAnalysis = new MainVehicleAnalysis(this);
        mainVehicleAnalysis.begin();
    }
}
