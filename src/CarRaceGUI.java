import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.PriorityQueue;
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
    private int xSpeed = 0;
    private int ySpeed = 0;
    private float speed = 1.0f;
    private int xMovemeent;
    private int yMovemeent;
    private int dx;
    private int dy;
    private int x;
    private int y;
    private int width;
    private int height;







    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
                                   public void run() {
                                       try {
                                           CarRaceGUI window = new CarRaceGUI();
                                           //window.frame.setVisible(true);
                                           window.setTitle("Car Race" + AddPlayers.name);
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

        setPreferredSize(new Dimension(1920, 1920));





       //Setting all the car objects here and i then call them in the paint method down below */

        cars = new Car[6];

        Car c1 = new Car(10, 10, 50, 20, 10, createRandomSpeed() * 2 , Color.YELLOW, 20);
        Car c2 = new Car(10, 10, 80, 20, 10, createRandomSpeed() * 2, Color.RED, 30);
        Car c3 = new Car(10, 10, 110, 20, 10, createRandomSpeed() * 2 , Color.BLUE, 20);
        Car c4 = new Car(10, 10, 140, 20, 10, createRandomSpeed() * 2, Color.pink, 30);
        Car c5 = new Car(10, 10, 170, 20, 10, createRandomSpeed() * 2 , Color.green, 20);
        Car c6 = new Car(10, 10, 200, 20, 10, createRandomSpeed() * 2, Color.orange, 30);

        cars[0] = c1;
        cars[1] = c2;
        cars[2] = c3;
        cars[3] = c4;
        cars[4] = c5;
        cars[5] = c6;



       JTextField info = new JTextField();
       info.setText(AddPlayers.name);







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
                if(cars[i].getPosition_X()< 1920){
                    /* here i am trying to add a simple collision to say when each car reaches the width of the screen which is
                1920 that it will stop . I have added the system out print to show that they are stopping either 10 above or 10 before 1920 */

                    cars[i].move(cars[i].getSpeed());
                    System.out.println(cars[i].getPosition_X());
                    cars[i].draw(gRef);
                }
                else{

                    cars[i].setPosition_X(1920);
                }

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
//Here i have created a user defined method to be able to give each car a random speed which i then call up for the value in the car objects
    //i have set it between 50 and 1 so that the speed dosesnt get to high to be able to see the cars move also .
    //however this does affect the collision that i have in my paint method because if a cars speed is 30 it will got 10 past 1920 finishing at 1930 which you can see in the out print window

    public int createRandomSpeed(){

        Random rand = new Random();

        int  n = rand.nextInt(50) + 1;

        return n;

    }


    }







