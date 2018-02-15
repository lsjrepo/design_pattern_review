package state;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class OrderedState implements State {
    @Override
    public void handle() {
        System.out.println("书本已经被预订！");
    }
}
