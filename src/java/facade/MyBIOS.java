package facade;

/**
 * Created by lusaijie on 2018/2/12.
 */
public class MyBIOS implements BIOS {
    @Override
    public void BiosCheck() {
        System.out.println("BIOS自检");
    }
}
