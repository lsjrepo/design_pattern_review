package flyweight;

/**
 * Created by lusaijie on 2018/2/13.
 */
public interface ChessFlyWeight {
    void setColor();
    String getColor();
    void display(Coordinate coordinate);
}
