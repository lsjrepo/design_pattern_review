package observer;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class ConcreteObserverA implements Observer {
    private int state;
    @Override
    public void update(Subject subject) {
        state=((ConcreteSubject)subject).getState();

    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
