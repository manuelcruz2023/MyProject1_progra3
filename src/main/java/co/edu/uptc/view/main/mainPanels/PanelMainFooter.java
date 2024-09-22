package co.edu.uptc.view.main.mainPanels;

import java.awt.Dimension;
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
        this.setLayout(null);
        this.setPreferredSize(new Dimension(800, 200));
    }

    private void begin() {
        setVisible(true);
    }
}
