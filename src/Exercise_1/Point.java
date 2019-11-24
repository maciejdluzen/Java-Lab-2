package Exercise_1;

public class Point {

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;

        return Math.sqrt(dx*dx + dy*dy);
    }

    public String toString() {
        return " (x: " + x + " y: " + y + ")";
    }
}
