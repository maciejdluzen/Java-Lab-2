package Exercise_1;

public class Circle {

    Point c;
    double r;

    public Circle(Point c, double r) {
        this.c = c;
        this.r = r;
    }

    public boolean doesItBelong(Point p) {
        return c.distance(p) <= r;
    }

    public String toString() {
        return " Srodek koła:" + c.toString() + ", Promien: " + r;
    }
}
