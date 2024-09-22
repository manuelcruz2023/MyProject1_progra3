package co.edu.uptc.view.main;

import javax.swing.JFrame;

import co.edu.uptc.view.main.mainPanels.PanelMainBody;
import co.edu.uptc.view.main.mainPanels.PanelMainFooter;
import co.edu.uptc.view.main.mainPanels.PanelMainHeader;
import java.awt.BorderLayout;

public class MainView extends JFrame{
    
    public MainView() {
        initFrame();
        createPanels();
    }

    private void initFrame() {
        setTitle("Main View");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void begin() {
        setVisible(true);
    }

    private void createHeader() {
        PanelMainHeader panelMainHeader = new PanelMainHeader();
        this.add(panelMainHeader, BorderLayout.NORTH);
    }

    private void createBody() {
        PanelMainBody panelMainBody = new PanelMainBody(this);
        this.add(panelMainBody, BorderLayout.CENTER);
    }

    private void createFooter() {
        PanelMainFooter panelMainFooter = new PanelMainFooter();
        this.add(panelMainFooter, BorderLayout.SOUTH);
    }

    private void createPanels() {
        createHeader();
        createBody();
        createFooter();
    }
}
