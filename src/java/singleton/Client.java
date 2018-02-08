package singleton;

/**
 * Created by lusaijie on 2018/2/8.
 */
public class Client{
    public static void main(String[] args) throws InterruptedException {
        DoubleCheck dc=DoubleCheck.getInstance();
        DoubleCheck dc2=DoubleCheck.getInstance();
        System.out.println(dc==dc2);
    }
}
