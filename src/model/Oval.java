package model;

public class Oval extends Circle {
    
    int radius2 = 0;

    @Override
    public void setRadius(int newRadius){
        if(newRadius >= 0)
            radius2 = newRadius;
    }

    @Override
    public int getRadius(){
        return radius2;
    }
}
