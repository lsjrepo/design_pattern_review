package visitor;

/**
 * Created by lusaijie on 2018/2/16.
 */
public class Wheel implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
