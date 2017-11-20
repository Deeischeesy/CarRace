import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;






public class CarBetApp extends Bettors{


    private static Plane makePlane;
    private static Car makeCar;
    private static Bus makeBus;
    private static Truck makeTruck;
    private static String makeBettor;

    public static void main(String [] args) {
        int i = 0;
        List<Bettors> fleet = new ArrayList<Bettors>();
        i = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of players"));
        for (i = '0'; i > 5; i++) {
            while (i >= 1) {
                String answer = JOptionPane.showInputDialog("Enter your vehicle choice:");
                if (answer.charAt(0) == 'B') {
                    Bus bus = makeBus();
                    fleet.add(bus);
                    //public static new Bettors() {
                    String playerName = JOptionPane.showInputDialog("Enter players name");
                    int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter your amount"));
                    //  Integer.toString(amount);
                    Bettors bettor = new Bettors();
                    break;

                } else if (answer.charAt(0) == 'T') {
                    Truck truck = makeTruck;
                    fleet.add(truck);
                    String playerName = JOptionPane.showInputDialog("Enter players name");
                    int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter your amount"));
                    // Integer.toString(amount);
                    Bettors bettor = new Bettors();
                    break;
                } else if (answer.charAt(0) == 'P') {
                    Plane plane = makePlane;
                    fleet.add(plane);
                    String playerName = JOptionPane.showInputDialog("Enter players name");
                    int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter your amount"));
                    //Integer.toString(amount);
                    Bettors bettor = new Bettors();
                    break;
                } else if (answer.charAt(0) == 'C') {
                    Car car = makeCar;
                    fleet.add(car);
                    String playerName = JOptionPane.showInputDialog("Enter players name");
                    int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter your amount"));
                    // Integer.toString(amount);
                    Bettors bettor = new Bettors();
                    break;


                }
                return Bettors;
            }
        }


        String message = "";
        for (Bettors b : fleet) {
            message += b.toString();
        }
        JOptionPane.showMessageDialog(null, message);
    }
        //return null;


    private static Bus makeBus() {
        return null;


    }



    private static Bettors makeBettor () {
                String playerName;
                String VehicleType;
                int amount;
                makeBettor = JOptionPane.showInputDialog("Enter Player:");
                playerName = JOptionPane.showInputDialog("Enter Name");
                VehicleType = JOptionPane.showInputDialog("Enter your Vehicle Choice");
                amount = Integer.parseInt(JOptionPane.showInputDialog("Enter your betting amount"));
                Bettors bettor = new Bettors();
                return bettor;
            }


        }





