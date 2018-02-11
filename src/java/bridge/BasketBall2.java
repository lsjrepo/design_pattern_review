package bridge;

/**
 * Created by lusaijie on 2018/2/11.
 */
public class BasketBall2 extends Shoe2 {
    public BasketBall2(Brand brand) {
        super(brand);
    }
    @Override
    public void sale() {
        super.sale();
        System.out.println("篮球鞋");
    }
}
