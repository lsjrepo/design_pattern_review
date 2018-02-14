package templateMethod;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class Client {
    public static void main(String[] args) {
        BankTemplateMethod bankTemplateMethod=new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("存点零花钱");
            }
        };
        bankTemplateMethod.process();
    }
}
