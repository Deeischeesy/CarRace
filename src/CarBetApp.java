import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;






public class CarBetApp {


    private static Plane makePlane;
    private static Car makeCar;
    private static Bus makeBus;
    private static Truck makeTruck;
    private static String makeBettor;

    public static void main(String [] args) {
        //int i;
        List<Bettors> fleet = new ArrayList<Bettors>();
        //for (int i = 0; i <= 4; i++)
            while (JOptionPane.showConfirmDialog(null, "Enter a new Player ?:") == JOptionPane.YES_OPTION) {


                String answer = JOptionPane.showInputDialog("Bus(B) or Truck(T) or Plane(P) or Car(C)");
                if (answer.charAt(0) == 'B') {
                    Bus bus = makeBus();
                    fleet.add(bus);
                } else if (answer.charAt(0) == 'T') {
                    Truck truck = makeTruck;
                    fleet.add(truck);
                } else if (answer.charAt(0) == 'P') {
                    Plane plane = makePlane;
                    fleet.add(plane);
                } else if (answer.charAt(0) == 'C') {
                    Car car = makeCar;
                    fleet.add(car);
                }


            }  String message = "";
                for (Bettors b : fleet) {
                    message += b.toString();
                }
                JOptionPane.showMessageDialog(null, message);

            }

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





