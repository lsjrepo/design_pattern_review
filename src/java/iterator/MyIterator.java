package iterator;

/**
 * Created by lusaijie on 2018/2/13.
 */
public interface MyIterator {
    void first();
    void next();
    boolean hasNext();
    boolean isFirst();
    boolean isLast();
    Object getCurrentObj();
}
