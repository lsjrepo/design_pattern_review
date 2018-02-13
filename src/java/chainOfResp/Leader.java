package chainOfResp;

/**
 * Created by lusaijie on 2018/2/13.
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }
    public abstract void handleRequest(LeaveRequest request);
}
