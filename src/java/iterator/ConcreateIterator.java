package iterator;

import java.util.List;

/**
 * Created by lusaijie on 2018/2/13.
 */
public class ConcreateIterator implements MyIterator{
    private List list;
    private int cursor;

    public ConcreateIterator(List list) {
        this.list = list;
    }

    @Override
    public void first() {
        cursor=0;
    }
    @Override
    public void next() {
        if (cursor<list.size()){
            cursor++;
        }
    }
    @Override
    public boolean hasNext() {
        if (cursor<list.size()){
            return true;
        }
        return false;
    }
    @Override
    public boolean isFirst() {
        return cursor==0?true:false;
    }
    @Override
    public boolean isLast() {
        return cursor == (list.size() - 1) ? true : false;
    }
    @Override
    public Object getCurrentObj() {
        return list.get(cursor);
    }
}