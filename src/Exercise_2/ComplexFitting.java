package Exercise_2;

public class ComplexFitting {

    public double calculateComplexCuttingCost(Figure[] f) {

        double totalCost = 0;

        for(int i = 0; i < f.length; i++) {
            totalCost += f[i].perimeter()*Figure.CUTTING_COST;
        }

        return totalCost;
    }

    public double calculateComplexMaterialCost(Figure[] f) {

        double totalArea = 0;

        for(int i = 0; i < f.length; i++) {
            totalArea += f[i].area()*Figure.CUTTING_COST;
        }

        return totalArea;
    }
}
