package model;

public class Square extends Shape{
    
    private int width = 0;

    public void setWidth(int newWidth){
        if(newWidth>=0)
        width = newWidth;
    }

    public int getWidth(){
        return width;
    }

    public void setHeight(int newHeight){
        setWidth(newHeight);
    }

    public int getHeight(){
        return getWidth();
    }

    @Override
    public double getArea(){
        return getWidth()*getHeight();
    }
}
