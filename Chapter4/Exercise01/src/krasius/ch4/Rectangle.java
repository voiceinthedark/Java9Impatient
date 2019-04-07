package krasius.ch4;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height){
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        //TODO: implement
        return null;
    }

    public Rectangle clone(){
        return new Rectangle(this.point, width, height);
    }
}
