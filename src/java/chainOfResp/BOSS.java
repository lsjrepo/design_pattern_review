package chainOfResp;

/**
 * Created by lusaijie on 2018/2/13.
 */
public class BOSS extends Leader {
    public BOSS(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays()<30){
            System.out.println("批准");
        }
        else {
            System.out.println("滚!");
        }
    }
}
