package Exercise_2;

public class Main {

    public static void main(String[] args) {

        Figure rect = new Rectangle(2,3);

        SimpleFitting bs = new SimpleFitting();

        System.out.println(bs.calculateCuttingCost(rect));



    }
}
