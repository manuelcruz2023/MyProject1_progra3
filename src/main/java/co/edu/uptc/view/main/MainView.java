package co.edu.uptc.view.main;

import javax.swing.JFrame;
import co.edu.uptc.view.main.mainPanels.PanelMainBody;
import co.edu.uptc.view.main.mainPanels.PanelMainHeader;
import co.edu.uptc.view.main.mainPanels.PanelMenu;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class MainView extends JFrame{
    
    GridBagConstraints gbc = new GridBagConstraints();
    public PanelMainBody panelMainBody;
    

    public MainView() {
        initFrame();
        createPanels();
    }

    private void initFrame() {
        setTitle("Main View");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void begin() {
        setVisible(true);
    }

    private void createHeader() {
        PanelMainHeader panelMainHeader = new PanelMainHeader();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.insets = new java.awt.Insets(10, 10, 10, 10);
        this.add(panelMainHeader, gbc);
    }

    private void createBody() {
        panelMainBody = new PanelMainBody(this);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new java.awt.Insets(10, 10, 10, 10);
        this.add(panelMainBody, gbc);
    }

    private void createPanel() {
        PanelMenu panelMenu = new PanelMenu(this);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.insets = new java.awt.Insets(10, 10, 10, 10);
        this.add(panelMenu, gbc);
    }

    private void createPanels() {
        createHeader();
        createPanel();
        createBody();
    }
}
