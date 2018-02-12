package decorator;

/**
 * Created by lusaijie on 2018/2/12.
 */
public class AntMan extends Superman{
    public AntMan(Human human) {
        super(human);
    }
    public void change(){
        System.out.println("变大或者缩小");
    }
    @Override
    public void move() {
        super.move();
        change();
    }
}
