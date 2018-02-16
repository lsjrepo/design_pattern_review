package visitor;

import builder.*;

/**
 * Created by lusaijie on 2018/2/16.
 */
public class Car implements Visitable {
    private Engine engine=new Engine();
    private Body body=new Body();
    private Wheel wheel=new Wheel();
    @Override
    public void accept(Visitor visitor) {
          visitor.visit(this);
          engine.accept(visitor);
          body.accept(visitor);
          wheel.accept(visitor);
    }
}
