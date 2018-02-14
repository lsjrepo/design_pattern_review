package mediator;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class Client {
    public static void main(String[] args) {
        Mediator m=new President();//中介者对象
        Market market=new Market(m);
        Development development=new Development(m);
        Finacial finacial=new Finacial(m);
        market.selfAction();
        market.outAction();
    }
}
