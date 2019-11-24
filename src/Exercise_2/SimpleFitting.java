package Exercise_2;

public class SimpleFitting {

    public double calculateCuttingCost(Figure f) {
        return f.perimeter()*Figure.CUTTING_COST;
    }

    public double calculateMaterialCost(Figure f) {
        return f.area()*Figure.MATERIAL_COST;
    }
}
