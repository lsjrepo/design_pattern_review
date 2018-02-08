package singleton;

/**
 * Created by lusaijie on 2018/2/8.
 * 双重检测 减少了锁的粒度，比懒汉式更有效率
 */
public class DoubleCheck {
   volatile private static DoubleCheck instance=null;
    public static DoubleCheck getInstance() throws InterruptedException {
        if(instance==null){
           Thread.sleep(300);
           synchronized (DoubleCheck.class){
               if(instance==null){
                   instance=new DoubleCheck();
               }
           }
        }
        return instance;
    }
}
