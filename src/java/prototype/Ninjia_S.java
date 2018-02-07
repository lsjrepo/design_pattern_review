package prototype;

import java.io.*;

/**
 * Created by lusaijie on 2018/2/7.
 * S级忍者，俗称:挂逼
 */
public class Ninjia_S implements Serializable {

    private static final long serialVersionUID = 2169380777227967513L;
    private String name;//名字
    private int rp;//血槽
    private Ninjutsu ninjutsu;//忍术
    public Ninjia_S(String name, int rp,Ninjutsu ninjutsu) {
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

    protected Object dclone() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return ois.readObject();
    }

}
