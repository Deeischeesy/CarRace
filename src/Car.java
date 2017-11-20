import java.awt.*;

import static java.awt.Color.black;

public class Car  {
    private float Position_X;
    private float Position_Y;
    private int width;
    private int height;
    private float speed;
    private Color color;

    public Car(){
       this(0.0f,0.0f,0,0,0.0f,Color.BLACK  );
    }


    public Car(float Position_X, float Position_Y, int width, int height, float speed, Color color){
        setPosition_X(Position_X);
        setPosition_Y(Position_Y);
        setWidth(width);
        setHeight(height);
        setSpeed(speed);
        setColor(color);
    }

    public float getPosition_X() {
        return Position_X;
    }

    public void setPosition_X(float position_X) {
        Position_X = position_X;
    }

    public float getPosition_Y() {
        return Position_Y;
    }

    public void setPosition_Y(float position_Y) {
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

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }








}