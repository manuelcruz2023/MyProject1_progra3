package co.edu.uptc.view.main.mainPanels;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import co.edu.uptc.globals.GlobalView;

public class PanelMainFooter extends JPanel{
    
    public PanelMainFooter () {
        initPanel();
        begin();
    }

    private void initPanel() {
        this.setBackground(GlobalView.FOOTER_BACKGROUND_COLOR);
        this.setForeground(GlobalView.FOOTER_TEXT_COLOR);
        this.setLayout(new BorderLayout());
    }

    private void begin() {
        setVisible(true);
    }
}
