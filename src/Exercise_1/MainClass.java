package Exercise_1;


import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        Point[] p = CircleGenerator.pointGenerator(5);

        CircleGenerator.result(CircleGenerator.circleGenerator(p));

    }
}
