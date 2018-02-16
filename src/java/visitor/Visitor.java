package visitor;

import com.sun.xml.internal.ws.client.sei.ResponseBuilder;

/**
 * Created by lusaijie on 2018/2/16.
 */
public interface Visitor {
    /**    
     *   
     * @author lsj  
     * @date 2018/2/16 16:05  
     * @param [wheel]  
     * @return void  
     */ 
    void visit(Wheel wheel);
    /**    
     *   
     * @author lsj  
     * @date 2018/2/16 16:06  
     * @param [engine]  
     * @return void  
     */ 
    void visit(Engine engine);
    /**    
     *   
     * @author lsj  
     * @date 2018/2/16 16:06  
     * @param [body]  
     * @return void  
     */ 
    void visit(Body body);
    /**    
     *   
     * @author lsj  
     * @date 2018/2/16 16:06  
     * @param [car]  
     * @return void  
     */ 
    void visit(Car car);
}
