package state;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("书本在馆!");
    }
}
