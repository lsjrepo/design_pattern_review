package chainOfResp;

/**
 * Created by lusaijie on 2018/2/13.
 */
public class Groupleader extends Leader{
    public Groupleader(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays()<3){
            System.out.println("小组长同意"+request.getEmpName());
            System.out.println("主任"+this.name+"，"+"审批通过");
        }
        else{
            if(this.nextLeader!=null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
