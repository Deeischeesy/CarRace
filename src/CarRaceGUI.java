import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CarRaceGUI extends JPanel{

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

            }
        );}


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
        //frame.add(this);

        //JLabel image1 = new JLabel(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));

        //frame.add(image1);


        JButton btnNewButton = new JButton("New button");
        btnNewButton.addActionListener(new ActionListener() {
                                           public void actionPerformed(ActionEvent e) {
                                           }
                                       });



            btnNewButton.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
            //btnNewButton.setBounds(10, 11, 76, 34);
		frame.getContentPane().add(btnNewButton);

        setSize(400,400);
        setVisible(true);

        setLayout(new BorderLayout());

        JLabel background=new JLabel(new ImageIcon("C:\\Users\\Gary\\Pictures\\backgroundimg.jpg"));

        add(background);

        background.setLayout(new FlowLayout());


        JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(0, 236, 89, 42);
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
		frame.getContentPane().add(btnNewButton_1);

            JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(0, 183, 89, 42);
        btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
		frame.getContentPane().add(btnNewButton_2);

            JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(0, 132, 89, 42);
        btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
		frame.getContentPane().add(btnNewButton_3);

            JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(0, 76, 89, 42);
        btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
		frame.getContentPane().add(btnNewButton_4);

            JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(0, 26, 89, 42);
        btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
		frame.getContentPane().add(btnNewButton_5);
        }
    }
