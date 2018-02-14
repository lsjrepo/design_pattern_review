package iterator;

import java.util.*;

/**
 * Created by lusaijie on 2018/2/13.
 */
public class Client {
    public static void main(String[] args) {
        List<Object> list=new ArrayList<>();
        for (int i=0;i<3;i++){
            list.add(i);
        }
        ConcreteMyAggregate concreteMyAggregate=new ConcreteMyAggregate(list);
        MyIterator iterator=concreteMyAggregate.createIterator();//获取迭代器
        while(iterator.hasNext()){
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}
