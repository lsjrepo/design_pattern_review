package composite;

/**
 * Created by lusaijie on 2018/2/12.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f2,f3,f4,f5;
        Folder f1=new Folder("/");
        f2=new ImageFile("a.jpg");
        f3=new TextFile("hello.txt");
        f1.add(f2);
        f1.add(f3);
        Folder f11=new Folder("/tmp");
        /*f1.killVirus();*/
        f4=new ImageFile("aa.png");
        f5=new ImageFile("bb.jpg");
        f11.add(f4);
        f11.add(f5);
        f1.add(f11);
        f1.killVirus();
    }
}
