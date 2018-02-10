package proxy.staticproxy;

/**
 * Created by lusaijie on 2018/2/10.
 */
public class ProxyKD implements Player {
    private Player player;

    public ProxyKD(Player player) {
        this.player = player;
    }

    @Override
    public void confer() {
        System.out.println("Large contract!");
    }

    @Override
    public void signContract() {
        System.out.println("?");
    }

    @Override
    public void dunk() {
        System.out.println("duang！");
    }

    @Override
    public void drink() {
            player.drink();
    }

    @Override
    public void championWay() {
            System.out.println("Join the warrior！");
    }
}
