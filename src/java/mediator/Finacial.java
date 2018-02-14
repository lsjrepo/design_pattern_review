package mediator;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class Finacial implements Department {
    private Mediator m;

    public Finacial(Mediator m) {
        this.m = m;
        m.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("我在拨款!");
    }

    @Override
    public void outAction() {
        System.out.println("数钱");
    }
}
