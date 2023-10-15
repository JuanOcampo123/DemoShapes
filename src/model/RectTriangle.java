package model;

public class RectTriangle extends Square {
    
    private int width = 0;

    public RectTriangle(){
        super();
    }

    @Override
    public void setWidth(int newWidth){
        if(newWidth >= 0)
            width = newWidth;
    }

    @Override
    public int getWidth(){
        return width;
    }

    @Override
    public void setHeight(int newHeight){
        setWidth(newHeight);
    }

    @Override
    public int getHeight(){
        return getWidth();
    }

    @Override
    public double getArea(){
        return (getWidth()*getHeight())/2;
    }
}
