import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.EventQueue;

public class CarRaceGUI extends JPanel {

    private JFrame frame;

    private BufferedImage image;

    /**
     * Launch the application.
     */ {
        try {
            image = ImageIO.read(new File("image name and path"));
        } catch (IOException ex) {
            // handle exception...
        }
    }
    /**
     * Create the application.
     */
    public CarRaceGUI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        ImageIcon image = new
                setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
    }

    private class setBounds extends ImageIcon {
        public setBounds(int i, int i1, int i2, int i3) {
        }
    }
}

