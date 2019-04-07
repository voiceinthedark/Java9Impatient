/**
 * Define toString, equals, and hashCode methods for the classes of the preceding
 * exercise
 */
package krasius.ch4;

public class Point {
    private double x;
    private double y;



    public Point(double x, double y){
        this.setX(x);
        this.setY(y);
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString(){
        return String.format("X=%d, Y=%d", getX(), getY());
    }

    @Override
    public boolean equals(Object obj) {
        Point other;
        if(obj.getClass() == this.getClass()){
            other = (Point) obj;
        }
        else return false;

        return this.getX() == other.getX() && this.getY() == other.getY();
    }

    @Override
    public int hashCode() {
        return Double.hashCode(this.getX()) + Double.hashCode(this.getY());
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
