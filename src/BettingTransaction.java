import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BettingTransaction{

    private String vehicle;
    private float stake;
    private String outcome = "";
    boolean win;
    boolean lose;
    private Component bets;



    public float getStake() {
        return stake;
    }

    public void setStake(float stake) {
        this.stake = stake;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }


    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean isLose() {
        return lose;
    }

    public void setLose(boolean lose) {
        this.lose = lose;
    }

    public Calendar getCal() {
        return cal;
    }

    public void setCal(Calendar cal) {
        this.cal = cal;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

   // public void setBets(Component bets){
       // this.bets =bets;
    //}

   // public Component getBets() {
      //  return bets;
    //}

    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH: mm : ss");


    public BettingTransaction(String vehicle, String format, Car c1, int i, String unknown) {
    }


    public void add() {
    }
}
