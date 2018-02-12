package facade;

/**
 * Created by lusaijie on 2018/2/12.
 */
public class Client {
    public static void main(String[] args) {
        /**在未使用外观模式之前的调用方法*/
       /* MyBIOS myBIOS=new MyBIOS();
        myBIOS.BiosCheck();
        MyKernel myKernel=new MyKernel();
        myKernel.run();
        MySystems mySystems=new MySystems();
        mySystems.init();*/
       CentOS centOS=new CentOS();
       centOS.start();
    }
}
