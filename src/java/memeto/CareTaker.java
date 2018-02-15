package memeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class CareTaker {
    private EmpMemento memento;
   /* private List<EmpMemento> mementos=new ArrayList<>();*/
   /*private Stack<EmpMemento> mementos=new Stack<>();*///多个备忘点保存的方法
    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }

}
