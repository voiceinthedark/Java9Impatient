package krasius.ch4;

public class Line extends Shape {

    private Point start;
    private Point end;

    public Line(Point from, Point to){
        this.start = from;
        this.end = to;
    }

    @Override
    public Point getCenter() {
        return new Point((end.getX() + start.getX()) / 2, (end.getY() + start.getY()) / 2);
    }

    private double getDistance(){
        return Math.sqrt((end.getX() - start.getX()) * (end.getX() - start.getX()) +
                ((end.getY() - start.getY())) * ((end.getY() - start.getY()))
        );
    }

    public Line clone(){
        Line clone = new Line(start, end);
        return clone;
    }
}
