package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lusaijie on 2018/2/15.
 */
public abstract class Subject {
    private List<Observer> list=new ArrayList<>();
    public void register(Observer observer){
        list.add(observer);
    }
    public void removeObserver(Observer observer){
        list.remove(observer);
    }
    public void notifyAlls(){
        for (Observer observer:list){
            observer.update(this);
        }

    }
}
