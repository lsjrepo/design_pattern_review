package bridge;

/**
 * Created by lusaijie on 2018/2/11.
 */
public class Casual2 extends Shoe2 {
    public Casual2(Brand brand) {
        super(brand);
    }
    @Override
    public void sale() {
        super.sale();
        System.out.println("休闲鞋");
    }
}
