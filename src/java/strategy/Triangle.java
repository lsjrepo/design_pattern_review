package strategy;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class Triangle implements Strategy {
    @Override
    public double getArea(double a, double b) {
        return a*b/2;
    }
}
