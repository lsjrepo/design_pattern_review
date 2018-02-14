package mediator;

/**
 * Created by lusaijie on 2018/2/14.
 */
public interface Mediator {
    void register(String dName,Department dt);
    void command(String dName);

}
