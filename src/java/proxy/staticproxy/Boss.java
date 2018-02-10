package proxy.staticproxy;

/**
 * Created by lusaijie on 2018/2/10.
 */
public class Boss {
    public static void main(String[] args) {
        Player player=new KevinDurant();
        Player proxy=new ProxyKD(player);
        player.drink();

    }
}
