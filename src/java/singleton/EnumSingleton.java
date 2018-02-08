package singleton;

/**
 * Created by lusaijie on 2018/2/8.
 * 通过枚举的方式实现单例
 * 无法实现懒加载
 */
public enum EnumSingleton {
    INSTANCE;
    public void singletonOperation(){
        //功能处理
    }
}
