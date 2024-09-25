package co.edu.uptc.view.main.mainPanels;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import co.edu.uptc.globals.GlobalView;
import co.edu.uptc.view.RoundedPanel;

public class PanelMainHeader extends JPanel{

    private RoundedPanel panelMainHeader;


    public PanelMainHeader() {
        initPanel();
        begin();
        createHeader();
        addTittle();
    }

    private void initPanel() {
        this.setBackground(GlobalView.MAIN_PANELS_BACKGROUND_COLOR);
        this.setForeground(GlobalView.BODY_TEXT_COLOR);
        this.setLayout(new BorderLayout());
    }

    private void begin() {
        setVisible(true);
    }

    private void createHeader() {
        panelMainHeader = new RoundedPanel(new BorderLayout(), 15, this.getBackground());
        panelMainHeader.setPreferredSize(new Dimension(200, 100));
        this.add(panelMainHeader, BorderLayout.NORTH);
    }

    private void addTittle() {
        JLabel tittle = new JLabel("Electric Vehicle Population Data");
        tittle.setHorizontalAlignment(JLabel.CENTER);
        tittle.setBounds(0, 0, 800, 200);   
        tittle.setForeground(getForeground());
        tittle.setFont(new Font("Lato", Font.BOLD, 50));
        panelMainHeader.add(tittle, BorderLayout.CENTER);
    }
}
