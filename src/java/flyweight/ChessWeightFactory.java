package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lusaijie on 2018/2/13.
 */
public class ChessWeightFactory {
    private static Map<String,ChessFlyWeight> map=new HashMap<>();
    public static ChessFlyWeight getChess(String color){
        if (map.get(color)!=null){
            return map.get(color);
        }
        else{
            ChessFlyWeight chessFlyWeight=new ConcreteChess(color);
            map.put(color,chessFlyWeight);
            return  chessFlyWeight;
        }

    }
}
