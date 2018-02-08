package singleton;

/**
 * Created by lusaijie on 2018/2/8.
 * 懒汉式加载，能够实现延时加载，
 * 缺点是调用的效率不高
 *
 */
public class Lasy {
    private static Lasy s;

    public Lasy() {
    }
    public static synchronized Lasy getInstance(){
        if (s==null){
            s=new Lasy();
        }
        return s;
    }
}
