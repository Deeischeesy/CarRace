import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference;

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
        List<Bettors> allBettors = new ArrayList<Bettors>();

        Bettors b1 = new Bettors(JOptionPane.showMessageDialog(null,"Joe Bloggs/n"+"Tralee/n","12345678T/n",1500, ));
               // JOptionPane.showMessageDialog(null,"Joe Bloggs/n"+"Tralee/n","12345678T/n",1500,"five");
        allBettors.add(b1);

        Bettors b2 = new Bettors("Jane Doe","Dingle","98765432K",2000,"six");
        allBettors.add(b2);

        Car c1 = new Car(10,10,20,10,5, Color.YELLOW);
        Car c2 = new Car(10,30,20,10,5,Color.RED);

        BettingTransaction bt1 = new BettingTransaction("12345678T",sdf.format(cal.getTime()),c1,25,"unknown");
        bt1.add();

        BettingTransaction bt2 = new BettingTransaction("78901234T",sdf.format(cal.getTime()),c2,26,"unknown");
        bt2.add();

        String message = "";
        for (Bettors b : allBettors) {
            message += b.toString();
        }
        JOptionPane.showMessageDialog(null, message);
    }
}




