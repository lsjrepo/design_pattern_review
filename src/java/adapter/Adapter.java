package adapter;

/**
 * Created by lusaijie on 2018/2/10.
 * 适配器
 */
public class Adapter extends Ps2KeyBoard implements Target{

    @Override
    public void handleRequest() {
        super.request();
    }
}
