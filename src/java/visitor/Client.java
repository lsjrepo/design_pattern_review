package visitor;

/**
 * Created by lusaijie on 2018/2/16.
 */
public class Client {
    public static void main(String[] args) {
        Car car=new Car();
        Visitor visitor=new PrintVisitor();
        car.accept(visitor);
    }
}
