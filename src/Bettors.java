
import java.awt.*;
import java.util.*;

public  class  Bettors {
    private String playerName;
    private String Address;
    private String AccountNumber ;
    private int balance;
    //private ArrayList<BettingTransaction> bets; //it will be an array list of BettingTransaction in the end but you can leave it as an array
    //list of String for now until you have the BettingTransaction class sorted
    private ArrayList<BettingTransaction> bets;


    @Override
    public String toString() {

        String allBets = "";

        for(BettingTransaction bet: bets)
            allBets+=bet + "\n\n"; //for any given bettor we must loop through their bets and append them to allBets for display

        return "Bettors{" +
                "playerName='" + playerName + '\'' +
                ", Address='" + Address + '\'' +
                ", AccountNumber='" + AccountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }




    public Bettors(){
        this("Unknown","Unknown","Unknown",0,new ArrayList<BettingTransaction>());
    }



    public Bettors(String playerName, String Address, String AccountNumber, int balance, ArrayList<BettingTransaction> bets){
        setPlayerName(playerName);
        setAccountNumber(AccountNumber);
        setAddress(Address);
        setBalance(balance);
        setBets(bets);
    }


    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setBets(ArrayList<BettingTransaction> bets){
        this.bets = bets;
    }

    public ArrayList<BettingTransaction> getBets() {
        return bets;
    }

    //driver to unit test the Bettors class

   public static void main(String args[]){

//        ArrayList<Bettors> allBettors = new ArrayList<Bettors>();
//        Car c1 = new Car(10,10.0f,20.0f,10,5,10.0f,Color.YELLOW,20.0f);
//        Car c2 = new Car(10,30.0f,20.0f,10,5,10.0f,Color.RED,30.0f);

        //creating 2 BettingTransaction objects (doing it using String for now though) for Joe Bloggs
//        BettingTransaction bet1 = new BettingTransaction("12345678T" ,c1,5.f, " Lose", "13:15:23");
//        BettingTransaction bet2 = new BettingTransaction("12345678T", c2, 5.f, " Lose", "13:16:28");




//        Bettors b1 = new Bettors("Joe Bloggs","Tralee","12345678T",1500,/*new ArrayList<BettingTransaction>()*/ new ArrayList<BettingTransaction>());

//        b1.getBets().add(bet1); //adding the bets to Joe's array list of bets
//        b1.getBets().add(bet2);

//        allBettors.add(b1); //adding Joe to the array list of bettors

//        Bettors b2 = new Bettors("Jane Doe","Dingle","98765432K",2000,/*new ArrayList<BettingTransaction>()*/ new ArrayList<BettingTransaction>());

//        allBettors.add(b2); //adding Jane to the array list of bettors

//        for(Bettors bettor : allBettors)
//            System.out.println(bettor); //displaying the contents of the array list of bettors


    }

}

