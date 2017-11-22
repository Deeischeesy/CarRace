

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CarBetApp extends Bettors {

    private static Car[] allcars;
    static List<Bettors> allBettors = new ArrayList<Bettors>();
    static Calendar cal = Calendar.getInstance();
    static SimpleDateFormat sdf = new SimpleDateFormat("HH: mm : ss");


    public static void main(String args[]){

        Car c1 = new Car(10,10.0f,20.0f,10,5,10.0f,Color.YELLOW,20.0f);
        Car c2 = new Car(10,30.0f,20.0f,10,5,10.0f,Color.RED,30.0f);

        List<Bettors> allBettors = new ArrayList<Bettors>();
        BettingTransaction bet1 = new BettingTransaction("12345678T",  c1, 15f,  "Lose",  "13:15:23");
        BettingTransaction bet2 = new BettingTransaction("12345678T",  c2, 5f, "Lose", "13:16:28");

        Bettors b1 = new Bettors("Joe Bloggs","Tralee","12345678T",1500,/*new ArrayList<BettingTransaction>()*/ new ArrayList<BettingTransaction>());

        b1.getBets().add(bet1); //adding the bets to Joe's array list of bets
        b1.getBets().add(bet2);

        allBettors.add(b1); //adding Joe to the array list of bettors

        Bettors b2 = new Bettors("Jane Doe","Dingle","98765432K",2000,/*new ArrayList<BettingTransaction>()*/ new ArrayList<BettingTransaction>());

        allBettors.add(b2); //adding Jane to the array list of bettors



        BettingTransaction bt1 = new BettingTransaction("12345678T", c2,30.0f,"win"," minutes");
        b1.getBets().add(bt1);

        BettingTransaction bt2 = new BettingTransaction("12345678S",c1,40.0f,"lost","minutes");
        b2.getBets().add(bt2);

        for(Bettors bettor : allBettors)
            System.out.println(bettor);




        String message = "";
        for (Bettors b : allBettors) {
            message += b.toString();
        }
        JOptionPane.showMessageDialog(null, message);
    }
}




