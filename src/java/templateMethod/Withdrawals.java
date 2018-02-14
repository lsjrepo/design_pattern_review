package templateMethod;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class Withdrawals extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("取款!!!");
    }
}
