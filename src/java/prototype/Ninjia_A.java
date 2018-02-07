package prototype;

import java.io.Serializable;

/**
 * Created by lusaijie on 2018/2/7.
 * 上忍
 */
public class Ninjia_A implements Cloneable{
    private String name;//名字
    private int rp;//血槽
    private Ninjutsu ninjutsu;//忍术
    public Ninjia_A(String name, int rp,Ninjutsu ninjutsu) {
        this.name = name;
        this.rp = rp;
        this.ninjutsu=ninjutsu;
    }

    public Ninjutsu getNinjutsu() {
        return ninjutsu;
    }

    public void setNinjutsu(Ninjutsu ninjutsu) {
        this.ninjutsu = ninjutsu;
    }

    protected Object clone() throws CloneNotSupportedException {
         Ninjia_A nn;
         nn= (Ninjia_A) super.clone();
        return nn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRp() {
        return rp;
    }

    public void setRp(int rp) {
        this.rp = rp;
    }
}
