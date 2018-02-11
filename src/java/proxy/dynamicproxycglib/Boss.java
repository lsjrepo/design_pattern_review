package proxy.dynamicproxycglib;

/**
 * Created by lusaijie on 2018/2/11.
 * 基于cglib2.2.2以及asm3.3.1
 */
public class Boss {
    public static void main(String[] args) {
        Player player=new KevinDurant();
        PlayerCgLib playerCgLib=new PlayerCgLib(player);
        Player proxyPlayer=playerCgLib.getProxy();
        proxyPlayer.drink();
    }
}
