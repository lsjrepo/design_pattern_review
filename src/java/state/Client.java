package state;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class Client {
    public static void main(String[] args) {
       BookContext ctx=new BookContext();
       ctx.setState(new FreeState());
       ctx.setState(new OrderedState());
    }
}
