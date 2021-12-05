import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 11:07 下午
 */
public class Directory extends Entry {
    private String name;
    private List<Entry> dir = new ArrayList<>();

    public Directory(String name) {         // 构造函数
        this.name = name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);  // 自动根据this类型，重载调用访问者的不同的业务处理逻辑
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : dir) {
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }

    /*可以遍历文件夹中所有条目*/
    public Iterator<Entry> iterator() {
        return dir.iterator();
    }
}
