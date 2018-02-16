package visitor;

/**
 * Created by lusaijie on 2018/2/16.
 */
public class Body implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
