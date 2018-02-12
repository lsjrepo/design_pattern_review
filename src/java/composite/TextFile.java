package composite;

/**
 * Created by lusaijie on 2018/2/12.
 */
public class TextFile implements AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀文本文件");
    }
}
