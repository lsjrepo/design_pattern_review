package templateMethod;

/**
 * Created by lusaijie on 2018/2/14.
 */
public abstract class BankTemplateMethod {
    public void takeNumber(){
        System.out.println("取号排队");
    }
    public abstract void transact();
    public void evaluate(){
        System.out.println("反馈评分");
    }
    public final void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
