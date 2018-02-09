package factory.simplefactory;

/**
 * Created by lusaijie on 2018/2/9.
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1=PhoneFactory.createPhone("小米");
        phone1.function();
        Phone phone2=PhoneFactory.createPhone("华为");
        Phone phone3=PhoneFactory.createPhone("Iphone");
        Phone phone4=PhoneFactory.createPhone("中兴");
    }
}
