package builder;

/**
 * Created by lusaijie on 2018/2/10.
 */
public class Tesla {
    private Engine engine;
    private Bettery bettery;
    private Suspension suspension;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Bettery getBettery() {
        return bettery;
    }

    public void setBettery(Bettery bettery) {
        this.bettery = bettery;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }
}
