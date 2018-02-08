package singleton;

import java.io.Serializable;

/**
 * Created by lusaijie on 2018/2/8.
 * 防止反序列化破坏单例
 */
public class BetterLasy implements Serializable{
    private static BetterLasy s;
    public static synchronized BetterLasy getInstance(){
        if (s==null){
            s=new BetterLasy();
        }
        return s;
    }
    private Object readResolve(){
        return s;
    }

}
