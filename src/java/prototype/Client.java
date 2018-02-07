package prototype;

import java.io.IOException;

/**
 * Created by lusaijie on 2018/2/7.
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Ninjia_A kakaxi=new Ninjia_A("旗木.卡卡西",50,new Ninjutsu(500,"影分身"));

        Ninjia_A kk;
        try {
             kk= (Ninjia_A) kakaxi.clone();

             System.out.println(kakaxi.getNinjutsu()==kk.getNinjutsu());
             System.out.println(kakaxi.getName()==kk.getName());
            // System.out.println(kk.getNinjutsu().getName()+"  "+kk.getNinjutsu().getDamage());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Ninjia_S naturo=new Ninjia_S("漩涡.那乳托",500,new Ninjutsu(1000,"影分身"));
        Ninjia_S nn;
        try {
            nn= (Ninjia_S) naturo.dclone();
            System.out.println(naturo.getNinjutsu()==nn.getNinjutsu());
            System.out.println(naturo.getName()==nn.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
