package iterator;



import java.util.*;

/**
 * Created by lusaijie on 2018/2/13.
 */
public class ConcreteMyAggregate implements MyAggregate{
    private List<Object> list;
    public ConcreteMyAggregate(List<Object> list) {
        this.list = list;
    }
    @Override
    public void addObject(Object object){
        this.list.add(object);
    }
    @Override
    public void removeObject(Object object){
        this.list.remove(object);
    }
    /**获取迭代器*/
    @Override
    public MyIterator createIterator(){
        return new ConcreateIterator(list);
    }

}
