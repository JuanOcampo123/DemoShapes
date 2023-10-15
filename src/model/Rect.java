package model;

public class Rect extends Square{
    
    private int height = 0;

    @Override
    public void setHeight(int newHeight){
        if(newHeight >= 0)
            height = newHeight;
    }

    @Override
    public int getHeight(){
        return height;
    }
}
