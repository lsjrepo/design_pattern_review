package command;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;//命令真正的执行者

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //执行相关的处理
        receiver.action();
    }
}
