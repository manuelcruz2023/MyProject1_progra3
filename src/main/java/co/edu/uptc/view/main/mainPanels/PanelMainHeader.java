package co.edu.uptc.view.main.mainPanels;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import co.edu.uptc.globals.GlobalView;

public class PanelMainHeader extends JPanel{

    public PanelMainHeader() {
        initPanel();
        begin();
        addTittle();
    }

    private void initPanel() {
        this.setBackground(GlobalView.HEADER_BACKGROUND_COLOR);
        this.setForeground(GlobalView.HEADER_TEXT_COLOR);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(800, 200));
    }

    private void begin() {
        setVisible(true);
    }

    private void addTittle() {
        JLabel tittle = new JLabel("Electric Vehicle Population Data");
        tittle.setBounds(0, 0, 800, 200);   
        tittle.setForeground(getForeground());
        tittle.setFont(new Font("Poster Pen JNL", Font.BOLD, 50));
        this.add(tittle, BorderLayout.CENTER);
    }
}
