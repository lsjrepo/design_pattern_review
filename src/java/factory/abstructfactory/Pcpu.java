package factory.abstructfactory;

/**
 * Created by lusaijie on 2018/2/9.
 */
public class Pcpu implements CPU {
    @Override
    public void name() {
        System.out.println("酷睿i7 990X");
    }
}
