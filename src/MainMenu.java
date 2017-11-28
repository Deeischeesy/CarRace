import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;


public abstract class MainMenu extends JFrame implements KeyListener,MouseListener {

    private static boolean[] mouseState = new boolean[3];

    public static void main(String args[]) {


        JFrame MainMenuFrame = new JFrame("Main Menu");
        MainMenuFrame.setSize(400, 600);
        MainMenuFrame.setLocationRelativeTo(null);//Centering the Jframe in the middle

        JPanel MainMenuPanel = new JPanel();
        MainMenuPanel.setBackground(Color.RED);

        JButton startGame = new JButton("Start");
        startGame.setVisible(true);

        System.out.println("Previous Bettors:" );
        ArrayList<Bettors>allBettors = new ArrayList<Bettors>();

        Car c1 = new Car(10,10.0f,20.0f,10,5,10.0f,Color.YELLOW,20.0f);
        Car c2 = new Car(10,30.0f,20.0f,10,5,10.0f,Color.RED,30.0f);

        BettingTransaction bet1 = new BettingTransaction("12345678T" ,c1,5.f, " Lose", "13:15:23");
        BettingTransaction bet2 = new BettingTransaction("12345678T", c2, 5.f, " Lose", "13:16:28");




     Bettors b1 = new Bettors("Joe Bloggs","Tralee","12345678T",1500,/*new ArrayList<BettingTransaction>()*/ new ArrayList<BettingTransaction>());

       b1.getBets().add(bet1); //adding the bets to Joe's array list of bets
       b1.getBets().add(bet2);

      allBettors.add(b1); //adding Joe to the array list of bettors

      Bettors b2 = new Bettors("Jane Doe","Dingle","98765432K",2000,/*new ArrayList<BettingTransaction>()*/ new ArrayList<BettingTransaction>());

      allBettors.add(b2); //adding Jane to the array list of bettors
        for(Bettors bettor : allBettors)
          System.out.println(bettor); //displaying the contents of the array list of bettors



        MainMenuFrame.add(MainMenuPanel);
        MainMenuPanel.add(startGame);
        MainMenuFrame.setVisible(true);

        String bet = "";
        String car = "";

                  JOptionPane.showInputDialog(null,"Please enter your name","Player Registration");
                  bet = JOptionPane.showInputDialog(null,"Please enter your amount");
                  car = JOptionPane.showInputDialog(null,"Please choose a car ");







        startGame.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                startGame.setVisible(false);
                new CarRaceGUI().setVisible(true); // Main Form to show after the Login Form..
            }
        });


    }    }

