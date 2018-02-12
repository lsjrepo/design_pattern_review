package facade;

/**
 * Created by lusaijie on 2018/2/12.
 */
public class MyKernel implements Kernel {
    @Override
    public void run() {
        System.out.println("系统引导");
    }
}
