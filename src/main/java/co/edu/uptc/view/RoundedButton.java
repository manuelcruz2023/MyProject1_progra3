package co.edu.uptc.view;

import javax.swing.*;
import java.awt.*;

public class RoundedButton extends JButton {

    public RoundedButton(String label) {
        super(label);

        // Decorative properties
        setBorderPainted(false);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw a rounded rectangle in the background of the button
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width, height, 25, 25);

        // Call the original paintComponent method to preserve the label and other properties of the button
        super.paintComponent(g);
    }
}