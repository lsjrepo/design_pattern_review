package builder;

/**
 * Created by lusaijie on 2018/2/10.
 */
public class Client {
    public static void main(String[] args) {
        TeslaDirector teslaDirector=new TeslaDirector(new TeslaBuilder());
        Tesla tesla=teslaDirector.createTesla();
        System.out.println(tesla.getBettery().getCapacity()+" "+tesla.getEngine().getPower()+" "+tesla.getSuspension().getParameters());
        //对象建造完毕
    }
}
