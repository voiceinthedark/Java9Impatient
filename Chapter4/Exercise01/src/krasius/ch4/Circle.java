package krasius.ch4;

public class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        super(center);
        this.center = center;
        this.radius = radius;
    }



    @Override
    public Point getCenter() {
        return this.center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle clone(){
        return new Circle(center, radius);
    }
}
