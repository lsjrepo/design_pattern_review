package memeto;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class Client {
    public static void main(String[] args) {
        CareTaker careTaker=new CareTaker();
        Emp emp=new Emp("小强",90,900);
        System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getSalary());
        careTaker.setMemento(emp.memento());
        emp.setAge(9);
        System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getSalary());
        emp.recovery(careTaker.getMemento());
        System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getSalary());
    }
}
