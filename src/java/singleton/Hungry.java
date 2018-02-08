package singleton;

/**
 * Created by lusaijie on 2018/2/8.
 * 饿汉式加载,线程安全,效率极高
 *
 */
public class Hungry {
    private static Hungry instance=new Hungry();

    public Hungry() {//防止被反射创建
        if(instance!=null) throw new RuntimeException();
    }
    public static Hungry getInstance(){
        return  instance;
    }
}
