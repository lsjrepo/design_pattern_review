package factory.factorymethod;

import factory.simplefactory.*;
import factory.simplefactory.Iphone;

/**
 * Created by lusaijie on 2018/2/9.
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1=new HuaWeiFactory().createPhone();
        Phone phone2=new XiaoMiFactory().createPhone();
        Phone phone3=new IphoneFactory().createPhone();
        phone2.function();
    }
}
