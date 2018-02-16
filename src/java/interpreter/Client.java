package interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lusaijie on 2018/2/16.
 */
public class Client {
    public static void main(String[] args) {
        String expression="w x z - +";
        Evaluator evaluator=new Evaluator(expression);
        Map<String,Expression> variables=new HashMap<>();
        variables.put("w",new Number(5));
        variables.put("w",new Number(5));
        variables.put("w",new Number(5));
        int result=evaluator.interpret(variables);
        System.out.println(result);
    }
}
