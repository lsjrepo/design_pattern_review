package mediator;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class Market implements Department{
    private Mediator m;

    public Market(Mediator m) {
        this.m = m;
        m.register("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("接项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，项目承接的进度，需要资金支持!");
        m.command("finacial");
    }
}
