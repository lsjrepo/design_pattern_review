package builder;

/**
 * Created by lusaijie on 2018/2/10.
 */
public class TeslaBuilder implements CarBuilder {
    @Override
    public Engine buildEngine() {
        System.out.println("组装发动机中...");
        return new Engine("10000P");//实际使用中，这边通常和工厂模式搭配，通过工厂模式来返回一个对象
    }

    @Override
    public Bettery buildbettery() {
        System.out.println("安装电池中....");
        return new Bettery("1024");
    }

    @Override
    public Suspension buildSuspension() {
        System.out.println("安装悬挂中...");
        return new Suspension("112");
    }
}
