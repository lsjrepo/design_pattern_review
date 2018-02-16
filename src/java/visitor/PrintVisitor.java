package visitor;

/**
 * Created by lusaijie on 2018/2/16.
 */
public class PrintVisitor implements Visitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("轮子");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("引擎");
    }

    @Override
    public void visit(Body body) {
        System.out.println("车身");
    }

    @Override
    public void visit(Car car) {
        System.out.println("整车");
    }
}
