package strategy;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class Client {
    public static void main(String[] args) {
        Strategy s1=new Rectangle();
        Strategy s2=new Triangle();
        Strategy s3=new Circular();
        Context ctx=new Context(s3);
        ctx.printArea(2,2);
    }
}
