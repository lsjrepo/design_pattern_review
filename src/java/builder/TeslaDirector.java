package builder;

/**
 * Created by lusaijie on 2018/2/10.
 * 装配者
 */
public class TeslaDirector implements CarDirector {
    private TeslaBuilder teslaBuilder;

    public TeslaDirector(TeslaBuilder teslaBuilder) {
        this.teslaBuilder = teslaBuilder;
    }

    @Override
    public Tesla createTesla() {
        Engine e=teslaBuilder.buildEngine();
        Suspension s=teslaBuilder.buildSuspension();
        Bettery b=teslaBuilder.buildbettery();
        Tesla tesla=new Tesla();
        tesla.setBettery(b);
        tesla.setEngine(e);
        tesla.setSuspension(s);//看到没?一步一步装的
        return tesla;
    }
}
