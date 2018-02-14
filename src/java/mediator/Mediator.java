package mediator;

/**
 * Created by lusaijie on 2018/2/14.
 */
public interface Mediator {
    /**    
     *   
     * @author lsj  
     * @date 2018/2/14 16:43  
     * @param [dName, dt]  
     * @return void  
     */ 
    void register(String dName,Department dt);
    /**    
     *   
     * @author lsj  
     * @date 2018/2/14 22:18
     * @param [dName]  
     * @return void  
     */ 
    void command(String dName);

}
