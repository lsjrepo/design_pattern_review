package flyweight;

/**
 * Created by lusaijie on 2018/2/13.
 */
public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chessFlyWeight1= ChessWeightFactory.getChess("黑色");
        ChessFlyWeight chessFlyWeight2= ChessWeightFactory.getChess("黑色");
        System.out.println(chessFlyWeight1.equals(chessFlyWeight2));
        System.out.println("增加外部状态的处理");
        chessFlyWeight1.display(new Coordinate(0,0));
        chessFlyWeight2.display(new Coordinate(10,0));

    }
}
