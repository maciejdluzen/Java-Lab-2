package Exercise_2;

public class Main {

    public static void main(String[] args) {


        //Obliczenia zlozonej ksztaltki
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(3);
        figures[1] = new Rectangle(3,6);
        figures[2] = new Square(3);

        ComplexFitting cf = new ComplexFitting();
        System.out.println(cf.calculateComplexCuttingCost(figures));
        System.out.println(cf.calculateComplexMaterialCost(figures));


        // Obliczenia prostej ksztaltki
        Figure rect = new Rectangle(2,3);

        SimpleFitting bs = new SimpleFitting();
        System.out.println(bs.calculateSimpleCuttingCost(rect));


    }
}
