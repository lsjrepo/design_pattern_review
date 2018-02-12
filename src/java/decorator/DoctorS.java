package decorator;

/**
 * Created by lusaijie on 2018/2/12.
 */
public class DoctorS extends Superman {
    public DoctorS(Human human) {
        super(human);
    }
    public void magic(){
        System.out.println("魔法");
    }
    @Override
    public void move() {
        super.move();
        magic();
    }
}
