package command;

/**
 * Created by lusaijie on 2018/2/14.
 * 命令发起
 */
public class Invoke {
    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }
    //业务方法，用于调用命令类的方法
    public void call(){
        command.execute();
    }
}
