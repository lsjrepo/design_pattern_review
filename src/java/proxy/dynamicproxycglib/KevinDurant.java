package proxy.dynamicproxycglib;



/**
 * Created by lusaijie on 2018/2/10.
 */
public class KevinDurant implements Player {
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
        System.out.println("Bath water！");
    }

    @Override
    public void championWay() {
        System.out.println("Join the warrior！");
    }
}
