package co.edu.uptc.view.main.mainPanels;

import javax.swing.JPanel;

import co.edu.uptc.globals.GlobalView;
import co.edu.uptc.view.RoundedPanel;
import co.edu.uptc.view.main.MainView;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class PanelMainBody extends JPanel{
    
    public MainView mainView;   
    public RoundedPanel panelMainBody;
     
    public PanelMainBody(MainView mainView) {
        this.mainView = mainView;
        initPanel();
        begin();
        createBody();
    }

    private void initPanel() {
        this.setBackground(GlobalView.MAIN_PANELS_BACKGROUND_COLOR);
        this.setForeground(GlobalView.BODY_TEXT_COLOR);
        this.setLayout(new BorderLayout());
    }

    private void begin() {
        setVisible(true);
    }

    private void createBody() {
        panelMainBody = new RoundedPanel(new BorderLayout(), 15, this.getBackground());
        panelMainBody.setPreferredSize(new Dimension(200, getHeight()));
        panelMainBody.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        this.add(panelMainBody, BorderLayout.CENTER);
    }
}
