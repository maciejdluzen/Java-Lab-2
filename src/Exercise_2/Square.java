package Exercise_2;

public class Square extends Figure {

    private double d;

    public Square(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double perimeter() {
        return 4*d;
    }

    public double area() {
        return d*d;
    }
}
