package visitor;

/**
 * Created by lusaijie on 2018/2/16.
 */
public class Engine implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
