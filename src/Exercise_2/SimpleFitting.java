package Exercise_2;

public class SimpleFitting {

    public double calculateSimpleCuttingCost(Figure f) {
        return f.perimeter()*Figure.CUTTING_COST;
    }

    public double calculateSimpleMaterialCost(Figure f) {
        return f.area()*Figure.MATERIAL_COST;
    }
}
