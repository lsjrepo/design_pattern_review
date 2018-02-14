package command;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class Client {
    public static void main(String[] args) {
        Command c=new ConcreteCommand(new Receiver());
        Invoke i=new Invoke(c);
        i.call();
    }
}
