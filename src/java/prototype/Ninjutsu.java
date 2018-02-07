package prototype;

import java.io.Serializable;

/**
 * Created by lusaijie on 2018/2/7.
 */
public class Ninjutsu implements Serializable {
    private int damage;//破坏力
    private String name;

    public Ninjutsu(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
