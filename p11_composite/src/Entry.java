/**
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 9:38 下午
 */
public abstract class Entry {

    public abstract String getName();

    public abstract Integer getSize();

    public abstract void printList(String prefix);

    public Entry add(Entry entry) throws FileTreatmentException {   // 加入目录条目
        throw new FileTreatmentException();
    }

    public void printList() {                                       // 为一览加上前缀并显示目录条目一览
        printList("");
    }

    public String toString() {                                      // 显示代表类的文字
        return getName() + " (" + getSize() + ")";
    }
}
