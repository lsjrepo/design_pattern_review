package mediator;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class Development implements Department{
    private Mediator m;

    public Development(Mediator m) {
        this.m = m;
    }

    @Override
    public void selfAction() {
        System.out.println("研发");
    }

    @Override
    public void outAction() {
        System.out.println("需要资金");
    }
}
