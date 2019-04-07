/**
 * Define an abstract class Shape with an instance variable of class Point, a
 * constructor, a concrete method public void moveBy(double dx, double dy) that
 * moves the point by the given amount, and an abstract method public Point
 * getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
 * public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
 * double height), and public Line(Point from, Point to).
 */
package krasius.ch4;

public abstract class Shape {
    protected Point point;

    public Shape(){}

    public Shape(Point p){
        this.point = p;
    }

    public void moveBy(double dx, double dy){
        this.point.setX(this.point.getX() + dx);
        this.point.setY(this.point.getY() + dy);
    }

    abstract public Point getCenter();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
