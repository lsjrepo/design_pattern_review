package strategy;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class Circular implements Strategy{
    @Override
    public double getArea(double a, double b) {
        if (a==b)
        return Math.PI*a*b;
        return -1;
    }
}
