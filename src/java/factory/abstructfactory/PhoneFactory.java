package factory.abstructfactory;

import com.sun.prism.Graphics;

/**
 * Created by lusaijie on 2018/2/9.
 */
public class PhoneFactory implements ElectronicFactory {

    @Override
    public CPU createCpu() {
        return new Pcpu();
    }

    @Override
    public GraphicsProcessor createG() {
        return new PhoneG();
    }

    @Override
    public Screen createScreen() {
        return new PhoneScreen();
    }
}
