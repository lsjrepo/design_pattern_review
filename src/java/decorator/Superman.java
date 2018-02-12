package decorator;

/**
 * Created by lusaijie on 2018/2/12.
 */
public class Superman implements Human {
    private Human human;
    public Superman(Human human) {
        this.human = human;
    }
    @Override
    public void move() {
        human.move();
    }
}
