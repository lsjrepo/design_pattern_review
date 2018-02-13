package flyweight;

/**
 * Created by lusaijie on 2018/2/13.
 */
public class ConcreteChess implements ChessFlyWeight {
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor() {
        this.color=color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置："+coordinate.getX()+"-----"+coordinate.getY());
    }
}
