public class Main {
    public static void main(String[] args) {

        Square s = new Square();
        s.setWidth(100);
        s.setHeight(200);

        Shape [] shapes = new Shape[5];
        shapes[0] = new Square();
        shapes[1] = new Rect();
        shapes[2] = new RectTriangle();
        shapes[3] = new Circle();
        shapes[4] = new Oval();

        for(Shape n : shapes){
            System.out.println(n.getX());
        }
    }
}