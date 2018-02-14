package strategy;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class Context {
    private Strategy strategy;//当前的算法对象

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void printArea(double a,double b){
        System.out.println("图形面积:"+strategy.getArea(a,b));
    }
}
