package decorator;

/**
 * Created by lusaijie on 2018/2/12.
 */
public class Ironman extends Superman {
    public Ironman(Human human) {
        super(human);
    }
    public void fly(){
        System.out.println("飞行");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
