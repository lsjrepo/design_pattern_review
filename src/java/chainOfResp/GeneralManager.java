package chainOfResp;

/**
 * Created by lusaijie on 2018/2/13.
 */
public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays()<10){
            System.out.println("批准通过");
        }
        else {
            if (this.nextLeader!=null){
                this.nextLeader.handleRequest(request);
            }
        }

    }
}
