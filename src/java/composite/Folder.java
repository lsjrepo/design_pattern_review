package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lusaijie on 2018/2/12.
 * 相当于前面讲的容器类
 */
public class Folder implements AbstractFile {
    private String name;
    private List<AbstractFile> list=new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }
    public void add(AbstractFile file){
        list.add(file);
    }
    public void remove(AbstractFile file){
        list.remove(file);
    }
    public AbstractFile getChild(int index){
        return list.get(index);
    }
    @Override
    public void killVirus() {
        System.out.println("对文件夹进行查杀");
        for (AbstractFile file:list){
            file.killVirus();
        }
    }
}
