package bridge;

/**
 * Created by lusaijie on 2018/2/11.
 */
public class Shoe2 {
    protected Brand brand;

    public Shoe2(Brand brand) {
        this.brand = brand;
    }
    public void sale(){
        brand.sale();
    }
}
