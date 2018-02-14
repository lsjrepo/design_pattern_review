package mediator;

import javax.print.attribute.standard.Media;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lusaijie on 2018/2/14.
 */
public class President implements Mediator{
    private Map<String,Department> map=new HashMap<>();
    @Override
    public void register(String dName, Department dt) {
        map.put(dName,dt);
    }
    @Override
    public void command(String dName) {
        map.get(dName).selfAction();
    }
}
