package chainOfResp;

/**
 * Created by lusaijie on 2018/2/13.
 */
public class Client {
    public static void main(String[] args) {
        Leader a=new Groupleader("小明");
        Leader b=new GeneralManager("小红");
        Leader c=new BOSS("小刚");
        a.setNextLeader(b);
        b.setNextLeader(c);
        LeaveRequest request=new LeaveRequest("小强",10,"玩");
        a.handleRequest(request);
    }
}
