package Exercise_1;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class CircleGenerator {

    public static Point[] pointGenerator(int n) {

        Point[] circleCentre = new Point[n];

        for(int i = 0; i < n; i++) {

            Random getX = new Random();
            int x = getX.nextInt(10);
//            double x = getX.nextDouble() * 10;
            Random getY = new Random();
            int y = getY.nextInt(10);
//            double y = getY.nextDouble() * 10;
            circleCentre[i] = new Point(x, y);
        }
        return circleCentre;
    }

    public static Circle[] circleGenerator(Point[] circleCentre) {

        Circle[] circles = new Circle[circleCentre.length];

        for(int i = 0; i < circleCentre.length; i++) {

            Random getR = new Random();
            int r = getR.nextInt(10);
//            double r = 1 + (2-1) * getR.nextDouble();
            circles[i] = new Circle(circleCentre[i], r);
        }
        return circles;
    }

    public static void result(Circle[] circles) {

        Point p = new Point(5,5);

        Circle[] result = new Circle[0];

        int j = 0;
        for(int i = 0; i < circles.length; i++) {
            if (circles[i].doesItBelong(p)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[j] = circles[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
