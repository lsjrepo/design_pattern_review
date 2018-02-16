package interpreter;

import java.util.Map;

/**
 * Created by lusaijie on 2018/2/16.
 */
public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        if (null==variables.get(name))
        return 0;
        return variables.get(name).interpret(variables);
    }
}
