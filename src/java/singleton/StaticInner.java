package singleton;

/**
 * Created by lusaijie on 2018/2/8.
 * 类加载的过程是线程安全的
 *
 */
public class StaticInner {
    private static class InnerClass{
        private static final StaticInner instance=new StaticInner();
    }
    public static StaticInner getInstance(){
        return InnerClass.instance;
    }
}
