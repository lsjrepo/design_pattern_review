package interpreter;

import java.util.Map;

/**
 * Created by lusaijie on 2018/2/15.
 */
public class Minus implements Expression{
    Expression left;
    Expression right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return left.interpret(variables)-right.interpret(variables);
    }
}
