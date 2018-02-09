package factory.abstructfactory;



/**
 * Created by lusaijie on 2018/2/9.
 */
public interface ElectronicFactory {
    CPU createCpu();
    GraphicsProcessor createG();
    Screen createScreen();
}
