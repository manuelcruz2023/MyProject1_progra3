package co.edu.uptc.view.dialogs.dialogVehicleAnalysis.panelsVehicleAnalysis;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.globals.GlobalView;

public class VehicleAnalysisBody extends JPanel{
    
    private GridBagConstraints gbc;
    private JPanel labelPanel;

    public VehicleAnalysisBody() {
        initComponents();
        createButtons();
        createPanelResult();
    }

    private void initComponents() {
        this.setSize(1200, 600);
        this.setBackground(GlobalView.BODY_BACKGROUND_COLOR);
        this.setLayout(new GridBagLayout()); // Establece un GridBagLayout
    }
    
    public void createButtonQuantityByModel() {
        gbc = new GridBagConstraints();
        JButton button = new JButton("Cantidad por modelo");
        button.setPreferredSize(new Dimension(200, 100));
        gbc.gridx = 0;
        gbc.gridy = 0;
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLabelResult("oli");
            }
        });
        this.add(button, gbc);
    }

    public void createButtonQuantityByManufacturer() {
        gbc = new GridBagConstraints();
        JButton button = new JButton("Cantidad por fabricante");
        button.setPreferredSize(new Dimension(200, 100));
        gbc.gridx = 0;
        gbc.gridy = 1;
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLabelResult("oli");
            }
        });
        this.add(button, gbc);
    }

    public void createButtonQuantityByElectricRange() {
        gbc = new GridBagConstraints();
        JButton button = new JButton("Cantidad por rango electrico");
        button.setPreferredSize(new Dimension(200, 100));
        gbc.gridx = 0;
        gbc.gridy = 2;
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLabelResult("oli");
            }
        });
        this.add(button, gbc);
    }

    public void createButtons() {
        createButtonQuantityByModel();
        createButtonQuantityByManufacturer();
        createButtonQuantityByElectricRange();
    }

    public void createPanelResult() {
        labelPanel = new JPanel();
        labelPanel.setBackground(GlobalView.HEADER_BACKGROUND_COLOR);
        labelPanel.setPreferredSize(new Dimension(200, 200));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(200,200,200,200); // 10 pixels of space on all sides
        this.add(labelPanel, gbc);
    }

    public JLabel createLabelResult(String result) {
        JLabel label = new JLabel();
        label.setPreferredSize(new Dimension(100, 100));
        label.setText(result);
        return label;
    }
}
