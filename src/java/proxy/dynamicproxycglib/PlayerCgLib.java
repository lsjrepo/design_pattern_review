package proxy.dynamicproxycglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.staticproxy.*;

import java.lang.reflect.Method;

/**
 * Created by lusaijie on 2018/2/11.
 */
    public class PlayerCgLib {
        private Player player;

        public PlayerCgLib(Player player) {
            this.player = player;
        }
        public Player getProxy(){
            Enhancer enhancer=new Enhancer();
            enhancer.setSuperclass(player.getClass());
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    System.out.println("KD的代理人");
                    method.invoke(player,objects);
                    System.out.println("KD的代理人");
                    return methodProxy;
                }
            });
            return (Player) enhancer.create();
        }
    }
