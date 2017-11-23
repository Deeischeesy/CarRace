import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CarRaceGUI {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CarRaceGUI window = new CarRaceGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
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
        frame.setBounds(100, 100, 635, 343);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);

        JButton btnNewButton = new JButton("New button");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
        btnNewButton.setBounds(10, 11, 76, 34);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("bt1");
        btnNewButton_1.setBounds(0, 236, 89, 23);
        frame.getContentPane().add(btnNewButton_1);
        ImageIcon car = new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg");

        JButton btnNewButton_2 = new JButton("bt2");
        btnNewButton_2.setBounds(0, 183, 89, 23);
        frame.getContentPane().add(btnNewButton_2);
        ImageIcon car2 = new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg");

        JButton btnNewButton_3 = new JButton("bt3");
        btnNewButton_3.setBounds(0, 132, 89, 23);
        frame.getContentPane().add(btnNewButton_3);
        ImageIcon car3 = new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg");

        JButton btnNewButton_4 = new JButton("bt4");
        btnNewButton_4.setBounds(0, 76, 89, 23);
        frame.getContentPane().add(btnNewButton_4);
        ImageIcon car4 = new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg");

        JButton btnNewButton_5 = new JButton("bt5");
        btnNewButton_5.setBounds(0, 26, 89, 23);
        frame.getContentPane().add(btnNewButton_5);
        ImageIcon car5 = new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg");
    }
}

