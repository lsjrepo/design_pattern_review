package proxy.dynamicproxy;


import java.lang.reflect.Proxy;

/**
 * Created by lusaijie on 2018/2/10.
 */
public class Boss {
    public static void main(String[] args) {
        Player KD=new KevinDurant();
        PlayerHandler handler=new PlayerHandler(KD);
        Player proxy= (Player) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Player.class},handler);
        proxy.drink();
    }
}
