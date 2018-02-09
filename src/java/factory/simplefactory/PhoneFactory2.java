package factory.simplefactory;

/**
 * Created by lusaijie on 2018/2/9.
 */
public class PhoneFactory2 {
    public static Phone createIpone(){
        return  new Iphone();
    }
    public  static Phone createXiaoMi(){
        return new XiaoMi();
    }
    public static HuanWei createHuaWei(){
        return new HuanWei();
    }
}
