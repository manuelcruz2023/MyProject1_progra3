package co.edu.uptc.view.main.mainPanels;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import co.edu.uptc.globals.GlobalView;
import co.edu.uptc.view.RoundedPanel;

public class PanelMenu extends JPanel {

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
        RoundedPanel panelMenu = new RoundedPanel(new BorderLayout(), 15, this.getBackground());
        panelMenu.setPreferredSize(new Dimension(200, getHeight()));
        this.add(panelMenu, BorderLayout.WEST);
    }
}
