/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 11:07 下午
 */
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    /*告诉访问者，正在访问的对象是File类的实例*/
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
