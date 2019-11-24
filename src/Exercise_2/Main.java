package Exercise_2;

public class Main {

    public static void main(String[] args) {

        //Obliczenia zlozonej ksztaltki
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(3);
        figures[1] = new Rectangle(3,6);
        figures[2] = new Square(3);

        ComplexFitting cf = new ComplexFitting();
        double cuttingCost = cf.calculateComplexCuttingCost(figures);
        double materialCost = cf.calculateComplexMaterialCost(figures);
        System.out.println("Koszt wyciecia złozonej kształtki wynosi: " + cuttingCost);
        System.out.println("Koszt materiału do wyciecia złozonej kształtki wynosi: " + materialCost);

        // Obliczenia prostej ksztaltki
        Figure rect = new Rectangle(2,3);

        SimpleFitting sf = new SimpleFitting();
        double cuttingCost2 = sf.calculateSimpleCuttingCost(rect);
        double materialCost2 = sf.calculateSimpleMaterialCost(rect);
        System.out.println("Koszt wyciecia prostej kształtki wynosi: " + cuttingCost2);
        System.out.println("Koszt materiału do wyciecia prostej kształtki wynosi: " + materialCost2);
    }
}
