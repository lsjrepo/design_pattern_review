package bridge;

/**
 * Created by lusaijie on 2018/2/11.
 */
public class Client {
    public static void main(String[] args) {
        Shoe2 shoe2=new BasketBall2(new Anta());
        shoe2.sale();
    }
}
