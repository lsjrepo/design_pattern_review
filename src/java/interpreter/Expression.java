package interpreter;

import java.util.Map;

/**
 * Created by lusaijie on 2018/2/15.
 */
    public interface Expression {
        /**    
         *   
         * @author lsj  
         * @date 2018/2/16 15:57
         * @param [variables]  
         * @return int  
         */ 
         int interpret(Map<String,Expression> variables);
    }
