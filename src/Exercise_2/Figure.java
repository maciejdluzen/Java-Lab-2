package Exercise_2;

public abstract class Figure {

    public static final double CUTTING_COST = 12; // koszt ciecia za metr
    public static final double MATERIAL_COST = 25; // koszt materialu za m2
    public static final double PI = 3.14;

    public abstract double perimeter();

    public abstract double area();
}


