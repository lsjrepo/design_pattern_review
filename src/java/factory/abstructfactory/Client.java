package factory.abstructfactory;

import factory.factorymethod.*;


/**
 * Created by lusaijie on 2018/2/9.
 */
public class Client {
    public static void main(String[] args) {
        PcFactory pf=new PcFactory();
        pf.createCpu().name();
        PhoneFactory pfy=new PhoneFactory();
        pfy.createG().name();
    }
}
