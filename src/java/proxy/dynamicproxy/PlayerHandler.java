package proxy.dynamicproxy;

import proxy.staticproxy.*;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lusaijie on 2018/2/10.
 */
public class PlayerHandler implements InvocationHandler {
    Player player;

    public PlayerHandler(Player player) {
        this.player = player;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //进行流程控制
        System.out.println(method.getName());
        Object object=method.invoke(player,args);
        return object;
    }
}
