package online.cafe.system;

import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel() {
        // Load and scale the background image to fit the JFrame size
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/FRONT.jpg")); // ✅ Use a valid name
        backgroundImage = icon.getImage().getScaledInstance(1922, 1080, Image.SCALE_SMOOTH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw scaled background image
        g.drawImage(backgroundImage, 0, 0, this);
    }
}
