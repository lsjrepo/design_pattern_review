package factory.abstructfactory;

/**
 * Created by lusaijie on 2018/2/9.
 */
public class PcG implements GraphicsProcessor {
    @Override
    public void name() {
        System.out.println("NVIDIA 1080Ti");
    }
}
