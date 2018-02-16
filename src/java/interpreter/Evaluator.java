package interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * Created by lusaijie on 2018/2/16.
 */
public class Evaluator implements Expression {
    private Expression syntaxTree;

    public Evaluator(String expression){
        Stack<Expression> expressions=new Stack<>();
        for (String token:expression.split(" ")){
            if (token.equals("+")){
                Expression subExpression=new Plus(expressions.pop(),expressions.pop());
                expressions.push(subExpression);
            }else if(token.equals("-")){
                Expression right=expressions.pop();
                Expression left=expressions.pop();
                Expression subExpression=new Minus(left,right);
                expressions.push(subExpression);
            }
            else{
                expressions.push(new Variable(token));
            }

        }
        syntaxTree=expressions.pop();
    }
    @Override
    public int interpret(Map<String, Expression> variables) {
        return syntaxTree.interpret(variables);
    }
}
