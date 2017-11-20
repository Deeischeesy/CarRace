public  abstract class Vehicle  {



    private String makeModel;

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }
    public Vehicle(String makeModel){
        setMakeModel(makeModel);
    }



}
