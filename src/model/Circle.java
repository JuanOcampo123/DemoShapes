package model;

public class Circle extends Shape {

    private int radius = 0;

    public void setRadius(int newRadius){
        if(newRadius >= 0)
            radius = newRadius;
    }

    public int getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}
