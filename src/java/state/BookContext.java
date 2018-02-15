package state;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class BookContext {
    private State state;
    public State getState() {
        return state;
    }
    public void setState(State state) {
        System.out.println("修改状态" );
        this.state = state;
        state.handle();
    }
}
