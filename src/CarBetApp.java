import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CarBetApp{

    private static Car[] allcars;
    static List<Bettors> allBettors = new ArrayList<Bettors>();
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH: mm : ss");


    public static void main(String args[]){

        Bettors b1 = new Bettors("Joe Bloggs","Tralee","12345678T",1500);
        allBettors.add(b1);

        Bettors b2 = new Bettors("Jane Doe","Dingle","98765432K",2000);
        allBettors.add(b2);

        Car c1 = new Car(10,10,20,10,5, Color.YELLOW);
        Car c2 = new Car(10,30,20,10,5,Color.RED);

        BettingTransaction bt1 = new BettingTransaction("12345678T",sdf.format(cal.getTime()),c1,25,"unknown");
        b1.getBets().add(bt1);

        String message = "";
        for (Bettors b : allBettors) {
            message += b.toString();
        }
        JOptionPane.showMessageDialog(null, message);
    }
}




