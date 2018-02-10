/**
 * Created by lusaijie on 2018/2/8.
 * 在类加载的时候，先成员变量再构造方法，先父类再子类
 * 多态表现：有同名的方法先执行子类中的方法
 */
public class Test01 {
    public static void main(String[] args) {
        Child c=new Child();
        c.test();
    }
}
