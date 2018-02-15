package observer;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class ConcreteSubject  extends Subject{
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAlls();//更新所有的订阅者

    }
}
