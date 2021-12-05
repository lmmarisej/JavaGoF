import java.util.Iterator;

/**
 * 为了让Entry类适用于Visitor，对被访问对象的抽象
 *
 * @author lmmarise.j@gmail.com
 * @since 2021/12/5 11:06 下午
 */
public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {       // 增加目录条目
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {    // 生成Iterator
        throw new FileTreatmentException();
    }

    public String toString() {                                          // 显示字符串
        return getName() + " (" + getSize() + ")";
    }
}
