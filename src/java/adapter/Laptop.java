package adapter;

/**
 * Created by lusaijie on 2018/2/10.
 */
public class Laptop {
    public void test01(Target target){
        target.handleRequest();
    }

    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        Ps2KeyBoard ps2KeyBoard=new Ps2KeyBoard();
        Target target=new Adapter();
        laptop.test01(target);//方法1
        Target target1=new Adapter2(ps2KeyBoard);
        laptop.test01(target1);//方法2
    }

}
