package co.edu.uptc.view.dialogs.dialogVehicleAnalysis.panelsVehicleAnalysis;

import javax.swing.JPanel;

import co.edu.uptc.globals.GlobalView;

public class VehicleAnalysisFooter extends JPanel{
    
    public VehicleAnalysisFooter() {
        initComponents();
    }

    private void initComponents() {
        this.setSize(1200, 100);
        this.setBackground(GlobalView.HEADER_BACKGROUND_COLOR);
        this.setLayout(null);
    }
}
