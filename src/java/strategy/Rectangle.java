package strategy;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class Rectangle implements Strategy {

    @Override
    public double getArea(double a, double b) {
        return a*b;
    }
}
