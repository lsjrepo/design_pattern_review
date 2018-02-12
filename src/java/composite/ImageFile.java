package composite;

/**
 * Created by lusaijie on 2018/2/12.
 */
public class ImageFile implements AbstractFile {
    private String name;
    @Override
    public void killVirus() {
        System.out.println("查杀图像文件");
    }

    public ImageFile(String name) {
        this.name = name;
    }
}
