package adapter;

/**
 * Created by lusaijie on 2018/2/10.
 */
public class Adapter2 implements Target{
    private Ps2KeyBoard keyBoard;
    @Override
    public void handleRequest() {
        keyBoard.request();
    }

    public Adapter2(Ps2KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }
}
