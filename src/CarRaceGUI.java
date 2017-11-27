import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class CarRaceGUI extends JFrame implements Runnable{

    //private JFrame frame;

    boolean gameOn;
    Thread gameThread;
    Car[] cars;
    Graphics g;
    Container c;
    private int xPosition;
    private int yPosition;
    private int xSpeed = 5;
    private int ySpeed = 7;
    private float speed = 1.0f;
    private int xMovemeent;
    private int yMovemeent;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
                                   public void run() {
                                       try {
                                           CarRaceGUI window = new CarRaceGUI();
                                           //window.frame.setVisible(true);
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
        //frame = new JFrame();
        //setBounds(100, 100, 635, 343);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = getContentPane();
        //c.setLayout(null);
        c.setBackground(Color.BLACK);

        setPreferredSize(new Dimension(400, 400));

        //frame.setVisible(true);


        //frame.add(this);

        //JLabel image1 = new JLabel(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));

        //frame.add(image1);


        /*JButton btnNewButton = new JButton("New button");
          btnNewButton.addActionListener(new ActionListener() {
                                           public void actionPerformed(ActionEvent e) {
                                           }
                                       });*/



        //btnNewButton.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
        //btnNewButton.setBounds(10, 11, 76, 34);
        //frame.getContentPane().add(btnNewButton);

        //setSize(400,400);



        //setLayout(new BorderLayout());


        //JLabel background=new JLabel(new ImageIcon("C:\\Users\\Gary\\Pictures\\backgroundimg.jpg"));

        //add(background);

        //background.setLayout(new FlowLayout());

        cars = new Car[10];

        Car c1 = new Car(10, 10, 50, 20, 10, createRandomSpeed() , Color.YELLOW, 20);
        Car c2 = new Car(10, 10, 80, 20, 10, createRandomSpeed(), Color.RED, 30);

        cars[0] = c1;
        cars[1] = c2;





        /*JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBounds(0, 236, 89, 42);
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
		frame.getContentPane().add(btnNewButton_1);

            JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBounds(0, 183, 89, 42);
        btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
		frame.getContentPane().add(btnNewButton_2);

            JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setBounds(0, 132, 89, 42);
        btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
		frame.getContentPane().add(btnNewButton_3);

            JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBounds(0, 76, 89, 42);
        btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
		frame.getContentPane().add(btnNewButton_4);

            JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBounds(0, 26, 89, 42);
        btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Gary\\Pictures\\images.jpg"));
		frame.getContentPane().add(btnNewButton_5);*/

        pack();
        setVisible(true);

        gameOn = true; //set the game loop variable to true
        start();  //create a new thread to run the game in and then start running that thread


    }

    //JB - paint() the JFrame and its contentpane every game loop iteration, drawing the background
    //and cars as it goes, also moving the cars along each iteration


    public void paint(Graphics gRef)
    {
        super.paint(gRef);

        c.setBackground(Color.BLACK);

        for(int i=0;i<cars.length;i++)
            if(cars[i]!=null)
            {
                cars[i].move(cars[i].getSpeed());
                cars[i].draw(gRef);
            }
    }





    //JB - run() is called automatically by the start() method below. Because the game needs to draw information onto the screen
    //and listen for keyboard/other events at the same time, an extra thread of execution is recommended. The run()
    //method basically ensures that the pane of the JFrame window gets painted/updated every 20 milliseconds
    //giving us 50 frames per second as such. The thread sleeps in between these updates meaning that the rest
    //of the time events can be listened for and handled without any conflict

    public void run()
    {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        g = getGraphics();

        while(gameOn)
        {


            try
            {

                paint(g);

                Thread.sleep(800);
            }
            catch (InterruptedException e)

            {
                break;
            }

            
        }
        System.out.println("Game now over!");

    }

    //JB - This method is called within the initialisation method to create a brand new thread of execution and run the game loop within that
    //thread. This method automatically calls the run() method defined above to kickstart the games execution

    public void start()
    {
        if (gameThread == null)
        {
            System.out.println("Creating new thread");
            gameThread = new Thread(this);
            gameThread.start();
        }
    }


    public int createRandomSpeed(){

        Random rand = new Random();

        int  n = rand.nextInt(50) + 1;

        return n;

    }






}
