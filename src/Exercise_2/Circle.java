package Exercise_2;

public class Circle extends Figure {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    public double perimeter() {
        return 2*Figure.PI*r;
    }


    public double area() {
        return Figure.PI*r*r;
    }
}
