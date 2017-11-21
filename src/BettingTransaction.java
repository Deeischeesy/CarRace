import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BettingTransaction{

    private String accountNumber;
    private Car carSelected;
    private float stake;
    private String outcome;
    private String time;


    public void setTime(String time){
        this.time=time;
    }
    public String getTime(){
        return time;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setCarSelected(Car carSelected) {
        this.carSelected = carSelected;
    }

    public Car getCarSelected() {
        return carSelected;
    }

    public float getStake() {
        return stake;
    }

    public void setStake(float stake) {
        this.stake = stake;
    }



    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
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


    public BettingTransaction(String accountNumber, Car carSelected, float stake, String outcome, String time) {
        setAccountNumber(accountNumber);
        setCarSelected(carSelected);
        setStake(stake);
        setOutcome(outcome);
        setTime(time);

        //fill in the rest here and create the corresponding mutators and accessors too, I've done some of it
    }


    public void add() {
    }
}
