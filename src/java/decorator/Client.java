package decorator;

/**
 * Created by lusaijie on 2018/2/12.
 */
public class Client {
    public static void main(String[] args) {
        Man man=new Man();//需要被加强的对象
        man.move();
        System.out.println("增加钢铁侠的技能");
        Ironman ironman =new Ironman(man);
        ironman.move();
        System.out.println("增加奇异博士的技能");
        DoctorS doctorS=new DoctorS(ironman);
        doctorS.move();
        System.out.println("增加蚁人的技能");
        AntMan antMan=new AntMan(doctorS);
        antMan.move();
    }
}
