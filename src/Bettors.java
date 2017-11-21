
import java.awt.*;

public  class  Bettors {
    private  String playerName;
    private String Address;
    private String AccountNumber ;
    private int balance;
    private String bets;


    @Override
    public String toString() {
        return "Bettors{" +
                "playerName='" + playerName + '\'' +
                ", Address='" + Address + '\'' +
                ", AccountNumber='" + AccountNumber + '\'' +
                ", balance=" + balance +
                ", bets='" + bets + '\'' +
                '}';
    }




    public Bettors(){
        this("Unknown","Unknown","Unknown",0,"unknown" );
    }



    public Bettors(String playerName, String Address, String AccountNumber, int balance, String bets){
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
    public void setBets(String bets){
        this.bets = bets;
    }

    public String getBets() {
        return bets;
    }


}

