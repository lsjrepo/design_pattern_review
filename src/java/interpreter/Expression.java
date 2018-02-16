package interpreter;

import java.util.Map;

/**
 * Created by lusaijie on 2018/2/15.
 */
public interface Expression {
     int interpret(Map<String,Expression> variables);
}
