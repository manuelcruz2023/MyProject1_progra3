package co.edu.uptc.view.main.mainPanels;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import co.edu.uptc.globals.GlobalView;
import co.edu.uptc.view.RoundedButton;
import co.edu.uptc.view.RoundedPanel;

public class PanelMenu extends JPanel {

    private RoundedPanel panelMenu;

    public PanelMenu() {
        initPanel();
        begin();
        createMenu();
    }

    private void initPanel() {
        this.setBackground(GlobalView.MAIN_PANELS_BACKGROUND_COLOR);
        this.setForeground(GlobalView.BODY_TEXT_COLOR);
        this.setLayout(new BorderLayout());
    }

    private void begin() {
        setVisible(true);
    }

    private void createMenu() {
        panelMenu = new RoundedPanel(new BorderLayout(), 15, this.getBackground());
        panelMenu.setPreferredSize(new Dimension(200, getHeight()));
        panelMenu.setLayout(new BoxLayout(panelMenu, BoxLayout.Y_AXIS));
        panelMenu.add(Box.createRigidArea(new Dimension(0, 10)));
        this.add(panelMenu, BorderLayout.WEST);
        createButtons();
    }

    private void createVehicleButton() {
        RoundedButton button = new RoundedButton("<html>Modulo de análisis<br> por vehículos</html>");
        button.setFont(new Font("Arial", Font.PLAIN, 15));
        button.setBackground(GlobalView.BUTTON_BACKGROUND_COLOR);
        button.setForeground(Color.WHITE);
        button.setMaximumSize(new Dimension(180, 70));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMenu.add(button);
        panelMenu.add(Box.createRigidArea(new Dimension(0, 10)));
    }
    
    private void createGeographycalButton() {
        RoundedButton button = new RoundedButton("<html>Modulo de análisis<br>geográfico</html>");
        button.setFont(new Font("Arial", Font.PLAIN, 15));
        button.setBackground(GlobalView.BUTTON_BACKGROUND_COLOR);
        button.setForeground(Color.WHITE);
        button.setMaximumSize(new Dimension(180, 70));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMenu.add(button);
        panelMenu.add(Box.createRigidArea(new Dimension(0, 10)));
    }

    private void createButtonClear() {
        RoundedButton button = new RoundedButton("Limpiar");
        button.setFont(new Font("Arial", Font.PLAIN, 15));
        button.setBackground(GlobalView.BUTTON_BACKGROUND_COLOR);
        button.setForeground(Color.WHITE);
        button.setMaximumSize(new Dimension(180, 70));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMenu.add(button);
    }

    private void createButtons() {
        createVehicleButton();
        createGeographycalButton();
        createButtonClear();
    }
}
