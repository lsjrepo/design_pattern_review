package observer;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class Client {
    public static void main(String[] args) {
        //目标对象
        ConcreteSubject subject=new ConcreteSubject();
        //创建多个观察者
        ConcreteObserverA coa=new ConcreteObserverA();
        ConcreteObserverA coa2=new ConcreteObserverA();
        ConcreteObserverA coa3=new ConcreteObserverA();
        //让这三个观察者添加到subject观察者队伍中
        subject.register(coa);
        subject.register(coa2);
        subject.register(coa3);
        subject.setState(1234);
        System.out.println(coa.getState());
        System.out.println(coa2.getState());
        System.out.println(coa3.getState());
        subject.removeObserver(coa3);
        subject.setState(5678);
        System.out.println(coa3.getState());
    }
}
