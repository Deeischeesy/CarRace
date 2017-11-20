public  class  Bettors {
    private String playerName;
    private String makeModel;
    private String VehicleType;
    private int amount;


    public Bettors(){
        this("Unknown","Unknown","Unknown",0);
    }



    public Bettors(String playerName, String VehicleType,String makeModel, int amount){
        setPlayerName(playerName);
        setMakeModel(makeModel);
        setCarNum(VehicleType);
        setAmount(amount);
    }
    public void setMakeModel(String Model){
        this.makeModel = Model;
    }
    public String getMakeModel(){
        return makeModel;
    }

    public void setPlayerName(String Player){
        this.playerName = Player;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void setCarNum(String Vehicle){
        this.VehicleType = Vehicle;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }


    public String toString() {
        return "Player Name:" + getPlayerName();
    }
}

