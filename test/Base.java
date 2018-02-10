/**
 * Created by lusaijie on 2018/2/8.
 */
public class Base {
    public Base(){
        test();
    }
    public void test(){

    }

}
 class Child extends Base{
    private int a=123;
    public Child(){}
    public void test(){
        System.out.println(a);
    }
}

