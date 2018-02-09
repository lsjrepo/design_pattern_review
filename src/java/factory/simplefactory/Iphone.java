package factory.simplefactory;

/**
 * Created by lusaijie on 2018/2/9.
 */
public class Iphone implements Phone {
    @Override
    public void function() {
        System.out.println("只要$999");
    }
}
