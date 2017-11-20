import java.awt.*;

public  class  Bettors {
    private String playerName;
    private String Address;
    private String AccountNumber ;
    private int balance;

    public Bettors(){
        this("Unknown","Unknown","Unknown",0);
    }



    public Bettors(String playerName, String Address, String AccountNumber, int balance){
        setPlayerName(playerName);
        setAccountNumber(AccountNumber);
        setAddress(Address);
        setBalance(balance);
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










}

