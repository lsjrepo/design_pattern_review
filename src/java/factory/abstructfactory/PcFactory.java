package factory.abstructfactory;

/**
 * Created by lusaijie on 2018/2/9.
 */
public class PcFactory implements ElectronicFactory {

    @Override
    public CPU createCpu() {
        return new Pcpu();
    }

    @Override
    public GraphicsProcessor createG() {
        return new PcG();
    }

    @Override
    public Screen createScreen() {
        return new PcScreen();
    }
}
