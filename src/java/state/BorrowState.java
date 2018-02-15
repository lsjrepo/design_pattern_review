package state;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class BorrowState implements State{
    @Override
    public void handle() {
        System.out.println("书籍已经被借走");
    }
}
