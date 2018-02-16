package interpreter;

import java.util.Map;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return number;
    }
}
