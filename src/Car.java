import java.awt.*;


import static java.awt.Color.black;

public class Car  {
    private int number;
    private int Position_X;
    private int Position_Y;
    private int width;
    private int height;
    private int speed;
    private Color color;
    private float odds;

    public Car(int number, float v, float v1, int width, int height, float v2, Color yellow, float odds){
        this(0,0,0,0,0,0,Color.BLACK ,0f );
    }




    public Car(int number, int Position_X, int Position_Y, int width, int height, int speed, Color color, float odds){
        setNumber(number); //add mutator and accessor for this
        setPosition_X(Position_X);
        setPosition_Y(Position_Y);
        setWidth(width);
        setHeight(height);
        setSpeed(speed);
        setColor(color);
        setOdds(odds); //and this too
    }

    public int getPosition_X() {
        return Position_X;
    }

    public void setPosition_X(int position_X) {
        Position_X = position_X;
    }

    public int getPosition_Y() {
        return Position_Y;
    }

    public void setPosition_Y(int position_Y) {
        Position_Y = position_Y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public float getOdds() {
        return odds;
    }

    public void setOdds(float odds) {
        this.odds = odds;
    }

    //JB - draw a car on screen
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.fillRect(Position_X,Position_Y,width,height);
    }

    //JB - move car on a number of pixels
    public void move(int units)
    {
        setPosition_X(getPosition_X() + units);
    }
}

