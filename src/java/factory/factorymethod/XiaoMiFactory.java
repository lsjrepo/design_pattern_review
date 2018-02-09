package factory.factorymethod;


/**
 * Created by lusaijie on 2018/2/9.
 */
public class XiaoMiFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new XiaoMi();
    }
}
