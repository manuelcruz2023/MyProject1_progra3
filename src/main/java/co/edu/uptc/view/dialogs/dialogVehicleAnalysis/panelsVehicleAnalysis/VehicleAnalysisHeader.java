package co.edu.uptc.view.dialogs.dialogVehicleAnalysis.panelsVehicleAnalysis;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.globals.GlobalView;

public class VehicleAnalysisHeader extends JPanel{
    
    public VehicleAnalysisHeader() {
        initComponents();
        addTittle();
    }

    private void initComponents() {
        this.setSize(1200, 100);
        this.setBackground(GlobalView.HEADER_BACKGROUND_COLOR);
        this.setForeground(GlobalView.HEADER_TEXT_COLOR);
        this.setLayout(null);
    }

    private void addTittle() {
        JLabel tittle = new JLabel("Modulo de Analisis de Vehiculos");
        tittle.setBounds(0, 0, 1200, 100);   
        tittle.setForeground(getForeground());
        tittle.setFont(new Font("Poster Pen JNL", Font.BOLD, 50));
        this.add(tittle);
    }
}
