import java.util.ArrayList;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 9:40 下午
 */
public class Directory extends Entry {

    private String name;
    private ArrayList directory = new ArrayList();      // 文件夹中目录条目的集合

    public Directory(String name) {         // 构造函数
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Integer getSize() {
        int size = 0;
        for (Object o : directory) {
            Entry entry = (Entry) o;
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Object o : directory) {
            Entry entry = (Entry) o;
            entry.printList(prefix + "/" + name);
        }
    }

    public Entry add(Entry entry) {         // 增加目录条目
        directory.add(entry);
        return this;
    }
}
