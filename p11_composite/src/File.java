/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 9:40 下午
 */
public class File extends Entry {
    private String name;
    private Integer size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
