package facade;

/**
 * Created by lusaijie on 2018/2/12.
 */
public class CentOS {
    public void start(){
        MyBIOS myBIOS=new MyBIOS();
        myBIOS.BiosCheck();
        MyKernel myKernel=new MyKernel();
        myKernel.run();
        MySystems mySystems=new MySystems();
        mySystems.init();
    }
}
