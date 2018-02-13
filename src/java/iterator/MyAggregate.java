package iterator;

/**
 * Created by lusaijie on 2018/2/13.
 */
public interface MyAggregate {
    void addObject(Object object);
    void removeObject(Object object);
    MyIterator createIterator();
}
